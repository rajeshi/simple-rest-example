package com.fiverr.simple_rest_project.tests;

import com.fiverr.simple_rest_project.managers.api.RestManager;
import com.fiverr.simple_rest_project.request.pojo.Approval;
import com.fiverr.simple_rest_project.request.pojo.ESignPackage;
import com.fiverr.simple_rest_project.request.pojo.Field;
import com.fiverr.simple_rest_project.request.pojo.Roles;
import com.fiverr.simple_rest_project.request.pojo.Signer;
import com.fiverr.simple_rest_project.response.pojo.ApprovalResponse;
import com.fiverr.simple_rest_project.response.pojo.DocumentResponse;
import com.fiverr.simple_rest_project.response.pojo.PackageResponse;
import com.fiverr.simple_rest_project.response.pojo.RolesResponse;
import com.fiverr.simple_rest_project.rest.modules.Authentication;
import com.fiverr.simple_rest_project.rest.modules.BasicAuthContext;
import com.fiverr.simple_rest_project.rest.modules.BasicMediaTypes;
import com.fiverr.simple_rest_project.rest.modules.PreemptiveBasicAuthentication;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTests extends Assert {

    @Test
    public void createPackageWorkFlowTests() {

        //NOTE: Tried basic authentication which automatically assigns the authorization. But it doesn't seem to work.
        BasicAuthContext ctx = new BasicAuthContext("esignlive.qatest@gmail.com", "eSignLiveQATest1");
        Authentication auth = new PreemptiveBasicAuthentication(ctx);

        //Authentication auth = new DefaultAuthentication(new AuthContext());

        /*List<Header> headList = new ArrayList<>();
        headList.add(new Header("Authorization", "a0k5UnBHZVlBSGtSOkZJUVoxNU1XUVRVTw=="));
        Headers headers = new Headers(headList);*/
        RestManager manager = new RestManager(BasicMediaTypes.JSON, auth, null);
        ESignPackage pkg = new ESignPackage();
        Response response = manager.post("https://sandbox.e-signlive.com/api", "/packages/", pkg);

        //Here I am getting 401
        assertEquals(response.statusCode(), 200, "Something went wrong with the request");
        String id = response.as(PackageResponse.class).getId();

        assertNotNull(id, "Something went wrong in the response");
        List<Header> headList = new ArrayList<>();
        String filename = Thread.currentThread().getContextClassLoader().getResource("src/main/resources/test.pdf").toString();
        headList.add(new Header("Content-Disposition", "form-data; name=\"file\"; filename=\"" + filename + "\""));
        headList.add(new Header("Content-Type", "application/pdf"));
        headList.add(new Header("Content-Transfer-Encoding", "binary"));
        Headers headers = new Headers(headList);

        manager = new RestManager(BasicMediaTypes.JSON, auth, headers);
        response = manager.post("https://sandbox.e-signlive.com/api", "/" + id + "/documents", "");
        DocumentResponse documentResp = response.as(DocumentResponse.class);
        assertEquals(documentResp.getStatus(), "", "Something went wrong with Dcoument Request");
        String docId = documentResp.getId();

        manager = new RestManager(BasicMediaTypes.JSON, auth, headers);
        Roles roles = new Roles();
        List<Signer> signers = new ArrayList<>();
        Signer signer = new Signer();
        signer.setEmail("def@e-signlive.com");
        signer.setFirstName("ABC");
        signer.setLastName("XYZ");
        signer.setCompany("ABC Pvt. Ltd.");
        signer.setTitle("Managing Director - Technology");
        signers.add(signer);
        roles.setName("def@e-signlive.com's role");
        roles.setSigners(signers);
        response = manager.post("https://sandbox.e-signlive.com/api", "/packages/" + id + "/roles", roles);
        RolesResponse rolesResp = response.as(RolesResponse.class);
        assertFalse(rolesResp.getLocked().booleanValue(), "Role is locked");

        Approval approval = new Approval();
        approval.setRole(rolesResp.getId());
        List<Field> fields = new ArrayList<>();
        Field field = new Field();
        field.setTop(50);
        field.setLeft(300);
        field.setWidth(200);
        field.setHeight(50);
        field.setPage(2);
        field.setType("SIGNATURE");
        field.setValue(null);
        field.setSubtype("FULLNAME");
        approval.setFields(fields);

        response = manager.post("https://sandbox.e-signlive.com/api", "/packages/" + id + "/documents/" + docId + "/approvals", approval);
        ApprovalResponse approvalResp = response.as(ApprovalResponse.class);
        assertEquals(approvalResp.getFields().get(0).getPage(), approval.getFields().get(0).getPage(), "Page Numbers do not match");

        approval = new Approval();
        approval.setRole(rolesResp.getId());
        fields = new ArrayList<>();
        field = new Field();
        field.setTop(50);
        field.setLeft(300);
        field.setWidth(200);
        field.setHeight(50);
        field.setPage(3);
        field.setType("SIGNATURE");
        field.setValue(null);
        field.setSubtype("FULLNAME");
        approval.setFields(fields);

        String signerName = rolesResp.getSigners().get(0).getFirstName();

        response = manager.post("https://sandbox.e-signlive.com/api", "/packages/" + id + "/documents/" + docId + "/approvals", approval);
        approvalResp = response.as(ApprovalResponse.class);
        assertEquals(approvalResp.getFields().get(1).getPage(), approval.getFields().get(0).getPage(), "Page Numbers do not match");

        approval = new Approval();
        approval.setRole(rolesResp.getId());
        fields = new ArrayList<>();
        field = new Field();
        field.setTop(50);
        field.setLeft(300);
        field.setWidth(200);
        field.setHeight(50);
        field.setPage(3);
        field.setType("SIGNATURE");
        field.setValue(null);
        field.setSubtype("FULLNAME");
        field.setBinding(signerName);

        response = manager.post("https://sandbox.e-signlive.com/api", "/packages/" + id + "/documents/" + docId + "/approvals", field);
        assertEquals(response.statusCode(), 200, "Something went wrong with the request");
        
        //I don't see an endpoint for sending a package. Only Bulk Send is available. Rest all are done.
    }
}
