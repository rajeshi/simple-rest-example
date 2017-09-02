package com.fiverr.simple_rest_project.rest.modules;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class PreemptiveBasicAuthentication extends Authentication {

    public PreemptiveBasicAuthentication(AuthContext context) {
        super(context);
    }

    @Override
    public RequestSpecification createRequest(RequestSpecification requestSpec) {
        BasicAuthContext ctx = (BasicAuthContext) this.context;
        return RestAssured.given().when().auth().preemptive().basic(ctx.getUsername(), ctx.getPassword());
    }

}
