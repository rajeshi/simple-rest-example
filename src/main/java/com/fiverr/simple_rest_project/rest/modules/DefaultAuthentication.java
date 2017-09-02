package com.fiverr.simple_rest_project.rest.modules;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DefaultAuthentication extends Authentication {

    public DefaultAuthentication(AuthContext context) {
        super(context);
    }

    @Override
    public RequestSpecification createRequest(RequestSpecification requestSpec) {
        return RestAssured.given(requestSpec).auth().none();
    }

}
