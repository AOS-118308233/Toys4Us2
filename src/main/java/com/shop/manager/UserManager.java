/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.manager;
import com.shop.DAO.UserDAO;
import com.shop.model.User;

/**
 *
 * @author aoife
 */
public class UserManager {
    /** This will take a username and select from user table
     * This will return three possible statuses, login correct, 
     * unknown user or password incorrect
     * @param email
     * @param password 
     * @return  
     */
    public User loginUser(String email, String password){
        
        UserDAO userDAO = new UserDAO();
        User user = userDAO.GetUserByEmail(email);
        if (user.getPassword().equals(password)){
            return user;
        }
        else return null;
    }
}
