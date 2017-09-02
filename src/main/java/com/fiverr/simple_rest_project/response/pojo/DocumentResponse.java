package com.fiverr.simple_rest_project.response.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "description",
    "id",
    "signedHash",
    "signerVerificationToken",
    "data",
    "approvals",
    "pages",
    "external",
    "extract",
    "index",
    "fields",
    "name",
    "size"
})
public class DocumentResponse {

    @JsonProperty("status")
    private String status;
    @JsonProperty("description")
    private String description;
    @JsonProperty("id")
    private String id;
    @JsonProperty("signedHash")
    private Object signedHash;
    @JsonProperty("signerVerificationToken")
    private Object signerVerificationToken;
    @JsonProperty("data")
    private Data data;
    @JsonProperty("approvals")
    private List<Object> approvals = null;
    @JsonProperty("pages")
    private List<Page> pages = null;
    @JsonProperty("external")
    private Object external;
    @JsonProperty("extract")
    private Boolean extract;
    @JsonProperty("index")
    private Integer index;
    @JsonProperty("fields")
    private List<Object> fields = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("size")
    private Integer size;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("signedHash")
    public Object getSignedHash() {
        return signedHash;
    }

    @JsonProperty("signedHash")
    public void setSignedHash(Object signedHash) {
        this.signedHash = signedHash;
    }

    @JsonProperty("signerVerificationToken")
    public Object getSignerVerificationToken() {
        return signerVerificationToken;
    }

    @JsonProperty("signerVerificationToken")
    public void setSignerVerificationToken(Object signerVerificationToken) {
        this.signerVerificationToken = signerVerificationToken;
    }

    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(Data data) {
        this.data = data;
    }

    @JsonProperty("approvals")
    public List<Object> getApprovals() {
        return approvals;
    }

    @JsonProperty("approvals")
    public void setApprovals(List<Object> approvals) {
        this.approvals = approvals;
    }

    @JsonProperty("pages")
    public List<Page> getPages() {
        return pages;
    }

    @JsonProperty("pages")
    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    @JsonProperty("external")
    public Object getExternal() {
        return external;
    }

    @JsonProperty("external")
    public void setExternal(Object external) {
        this.external = external;
    }

    @JsonProperty("extract")
    public Boolean getExtract() {
        return extract;
    }

    @JsonProperty("extract")
    public void setExtract(Boolean extract) {
        this.extract = extract;
    }

    @JsonProperty("index")
    public Integer getIndex() {
        return index;
    }

    @JsonProperty("index")
    public void setIndex(Integer index) {
        this.index = index;
    }

    @JsonProperty("fields")
    public List<Object> getFields() {
        return fields;
    }

    @JsonProperty("fields")
    public void setFields(List<Object> fields) {
        this.fields = fields;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
