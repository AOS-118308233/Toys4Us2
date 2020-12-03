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
public class AdminDAO {
    
    public User GetUserByEmail(String email) {
        
        User admin1 = new User();
        
        if("admin@admin.com".equals(email)) {
            
        admin1.setId(1);
        admin1.setEmail("admin@admin.com");
        admin1.setPassword("Admin");
        admin1.setFirstName("Aoife");
        admin1.setLastName("O'Sullivan");
        admin1.setUserType(IConstants.USER_TYPE_ADMIN);
        return admin1;
        }
        
        else {
        User user2 = new User();
        
        user2.setId(2);
        user2.setEmail("bill@gmail.com");
        user2.setPassword("user2");
        user2.setFirstName("Bill");
        user2.setLastName("Emerson");
        user2.setUserType(IConstants.USER_TYPE_GENERAL_USER);
        
        return user2;
        
        }
    }

    
}
