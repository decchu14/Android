package com.example.lab_5.model;

public class login {
    private String username,password;

    public login(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public login()
    {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
