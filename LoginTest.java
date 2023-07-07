/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10343509_poe;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 *
 * @author thaba
 */
public class LoginTest {
    
   Login instance = new Login();
    public void testCheckUserName(){
        /**
         * This will test whether the CheckUserName method is functional
         */
        
                
        System.out.println("Username");
        String username = "kgt_3";
        boolean expResult = true;
        boolean result = Login.Login_User.CheckUserName(username);
        assertEquals(true, result);
    }
    
    public void testCheckPasswordComplexity(){
          /**
         * This will test whether the CheckPasswordComplexity method is functional
         */
          
        System.out.println("Password");
        String password = "2ja@mes";
        boolean expResult = true;
        boolean result = Login.Login_User.CheckPasswordComplexity(password);
        assertEquals(true, result);
    }
    
}


