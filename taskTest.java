/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.st10343509_poe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author thaba
 */
public class taskTest {
    
    public taskTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of createTaskID method, of class task.
     */
    @Test
    public void testCreateTaskID_3args_1() {
        System.out.println("createTaskID");
        int i = 0;
        String TaskName = "";
        String string = "";
        String expResult = "";
        String result = task.createTaskID(i, TaskName, string);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String Description = "";
        task instance = new task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(Description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class task.
     */
    @Test
    public void testCreateTaskID_3args_2() {
        System.out.println("createTaskID");
        String Tname = "";
        String DeveloperDetails = "";
        int Tnumber = 0;
        task instance = new task();
        String expResult = "";
        String result = instance.createTaskID(Tname, DeveloperDetails, Tnumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String Tstatus = "";
        String DeveloperDetails = "";
        int Tnumber = 0;
        String Tname = "";
        String Description = "";
        String TID = "";
        int Duration = 0;
        task instance = new task();
        String expResult = "";
        String result = instance.printTaskDetails(Tstatus, DeveloperDetails, Tnumber, Tname, Description, TID, Duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int Duration = 0;
        int Totalhrs = 0;
        task instance = new task();
        int expResult = 0;
        int result = instance.returnTotalHours(Duration, Totalhrs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
