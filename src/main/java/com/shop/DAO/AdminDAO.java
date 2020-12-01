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
        
        admin1.setId(1);
        admin1.setEmail("admin@admin.com");
        admin1.setPassword("Admin");
        admin1.setFirstName("Aoife");
        admin1.setLastName("O'Sullivan");
        admin1.setUserType(IConstants.USER_TYPE_ADMIN);
        
        return admin1;

        
        
    }

    
}
