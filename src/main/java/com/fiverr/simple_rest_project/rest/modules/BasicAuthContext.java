package com.fiverr.simple_rest_project.rest.modules;

public class BasicAuthContext extends AuthContext {

    private final String username;
    private final String password;

    public BasicAuthContext(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
