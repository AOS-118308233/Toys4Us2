/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.model;

/**
 *
 * @author aoife
 */
public class User {
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String userType;
    
    public User(int id, String email, String password, String firstName, String lastName, String userType) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
        
    }

  
    
}
