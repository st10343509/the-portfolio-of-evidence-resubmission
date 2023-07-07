/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10343509_poe;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thaba
 */
public class taskTest {
  public class TESTtask {
    
    
     Task instance = new Task();
    
    public void testCheckTaskDescription(){
     String tDescription = "This creates a login for authentication";
     boolean result = instance.checkTaskDescription(tDescription);
     assertEquals(true, result);
        
        
    }
    
     public void testCreateTaskID(){
         int Tnumber = 2;
     String Tname = " Login Feauture";
      String DeveloperDetails = "Robyn Harrison";
      String expResult = "";
     String result = instance.createTaskID(Tname,DeveloperDetails, Tnumber);
     assertEquals(true, result);
        
        
    }
     
     public void testReturnTotalHours(){
         int Duration = 0;
         int Hours = 0;
         int expResult = 0;
     int result = instance.returnTotalHours(Duration,Hours);
     assertEquals(true, result);
     }
  }
}
        