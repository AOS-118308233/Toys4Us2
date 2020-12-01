/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.Servlets;

import com.shop.model.User;
import com.shop.utils.IConstants;
import com.shop.manager.UserManager;



import com.sun.tools.javac.util.StringUtils;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author aoife
 */
public class LoginServlet extends HttpServlet {
    //Code given by tutors in the labs
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        if(StringUtils.isStringEmpty(email) || StringUtils.isStringEmpty(password)) {
            
            RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
            rd.forward(request, response);
        } else {
            
            UserManager uMgr = new UserManager();
            User user = uMgr.loginUser(email, password);
            
            if(user == null) {
                RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response);
            } else {
                request.getSession(true).setAttribute(IConstants.SESSION_KEY_USER,user);
                
                //if the user type is Admin then they will be sent to the admin home page 
                if(user.getUserTye().equals(IConstants.USER_TYPE_ADMIN)) {
                    RequestDispatcher rd = request.getRequestDispatcher("/adminHome.jsp");
                    rd.forward(request, response);
                } 
                //if the user isn't a user that has signed up they will be added to the "database" and will be returned to index.html
                else if (user.getUserType().equals(IConstants.USER_TYPE_GENERAL_USER)) {
                    RequestDispatcher rd = request.getRequestDispatcher("/index.html");
                    rd.forward(request, response);
                }
                //If the user is a registered user they will also be sent to the index.html page
                else {
                    RequestDispatcher rd = request.getRequestDispatcher("/index.html");
                    rd.forward(request, response);
                }
            }
            
        }
    }
}
