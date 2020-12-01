/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.DAO;

import com.shop.model.User;
import com.shop.utils.IConstants;

/**
 *
 * @author aoife
 */
public class UserDAO {
    
    public User GetUserByEmail(String email) {
        
        User user1 = new User();
        
        user1.setId(1);
        user1.setEmail("admin@admin.com");
        user1.setPassword("Admin");
        user1.setFirstName("Aoife");
        user1.setLastName("O'Sullivan");
        user1.setUserType(IConstants.USER_TYPE_ADMIN);
        
        return user1;
        
        
        
    }

    
}
