package com.fiverr.simple_rest_project.rest.modules;

import io.restassured.specification.RequestSpecification;

public abstract class Authentication {

    protected final AuthContext context;

    public Authentication(AuthContext context) {
        this.context = context;
    }

    public abstract RequestSpecification createRequest(RequestSpecification requestSpec);
}
