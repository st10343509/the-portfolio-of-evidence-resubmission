/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10343509_poe;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author thaba
 */
public class ST10343509_POE {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Login l = new Login();
        Task t = new Task();
        
        
        Scanner log = new Scanner(System.in);
        
    System.out.println("Please enter your first name");
    String First= log.next();
    
    System.out.println("Please enter your Surname");       
    String Surname = log.next();
    
     System.out.println("Please enter your username");
    String Username =log.next();
    
     if(Login.Login_User.CheckUserName(Username) == true) {
    System.out.println("Username has been captured successfully");
    
  System.out.println("Please enter your password");
    String Password = log.next();
        
        if(Login.Login_User.CheckPasswordComplexity(Password) == true){
        System.out.println("Password has been captured successfully");
        System.out.println(Login.Login_User.RegisterUser(Username, Password));
      
        System.out.println("Please enter your username to sign in ");
        String UserNameCheck= log.next();
        
       System.out.println("Please eneter your password to sign in");
       String PassWordCheck = log.next();
       
        if( Login.Login_User.LoginUser(Username, Password, UserNameCheck, PassWordCheck) == true ) {
          System.out.println(Login.Login_User.ReturnLoginStatus("success"));
          System.out.println("Welcome" + First + "" + Surname + "it is great to see you");
   
    }else{
          System.out.println(Login.Login_User.ReturnLoginStatus("Username or password is incorrect please try again "));
     }
        
        }else{
         System.out.println(Login.Login_User.RegisterUser(Username, Password));
        }
     
    }else {
             String Password = "";
             System.out.println(Login.Login_User.RegisterUser(Username, Password));
    
    System.out.println("Welcome to kanban");
    }
   
     int Tnumber =0;
     String Description;
     int choice = 0;
     int Hours = 0;
     int statusChoice;
     String [] Developer = new String [Tnumber];
     String [] TaskStatus = new String [Tnumber];
      int [] TaskDuration = new int [Tnumber];
     String [] report = new String [Tnumber];
     String [] TaskNames = new String [Tnumber];
     String [] TaskID = new String  [Tnumber];
        
                   

    JOptionPane.showInputDialog("Please select one of the following: \n\t" + "(1) add tasks \n\t (2) Show report  \n\t (3) Quit");
    
        
    switch(choice){
        
        case 1:
            
        if(choice  == 1){
            
            Tnumber =  Integer.parseInt(JOptionPane.showInputDialog(null, "How many task would you like to add?" , "Task", JOptionPane.QUESTION_MESSAGE));
            for(int i = 0; i < Tnumber; i++){
                TaskNames[i] =  JOptionPane.showInputDialog(null, "What is the name of the task name?", "Task Name", JOptionPane.QUESTION_MESSAGE);
              Developer[i] =  JOptionPane.showInputDialog(null, "What is the name of the developer ?", "Developer Name", JOptionPane.QUESTION_MESSAGE);
              Description =  JOptionPane.showInputDialog(null, "Please enter a description for the task * Note  not longer than 50 characters");
           
              TaskID[i] = t.createTaskID(TaskNames[i] , Developer[i], i + 1);
              TaskDuration[i] = Integer.parseInt(JOptionPane.showInputDialog("Please enter an amount of hours"));
              Hours = t.returnTotalHours(Hours, TaskDuration[i]);
              
            statusChoice = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the status of the task out of the folloiwng : \n\t 1. To Do \n\t 2. Done \n\t 3. Doing", "Task Status", JOptionPane.QUESTION_MESSAGE));
              
            switch (statusChoice){
               
              
                
                case 1 :
                    
                    TaskStatus[i] = "To do";
                    break;
                    
                case 2:
                        TaskStatus[i] = "Done";
                    break;
                    
                case 3:
                        TaskStatus[i] = "Doing";
                    break;
                    
    
                    
                    int Menu = 0
    while(Menu!=6)
    {
       MenuArrays mr = new MenuArrays ();
       
       Menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option: (1) Show Done Task  \n (2) Find Task \n(3)Report \n (4)Task with longest Duration \n(5) Delet Task \n (6) Return to main menu"));
       
       switch(Menu)
       {
           case 1:
               if (Menu == 1)
                       {
                  mr.Done(Developer, TaskNames, TaskStatus, TaskDuration);
                       }
                       
           case 2:
               if (Menu == 2)
               {
                   String loc = JOptionPane.showInputDialog(null, "Which Task would you like to find?", "Find Task", JOptionPane.QUESTION_MESSAGE);
                   mr.FindTask(TaskNames, Developer, TaskStatus, First);
                       }
           case 3:
               if(Menu == 3)
               {
                   mr.Report(report);
               }
               
           case 4:
               
               if(Menu == 4)
               {
                   mr.LongestTask(TaskDuration, Developer);
               }
               
           case 5:
               if(Menu == 5)
               {
                   String h = JOptionPane.showInputDialog(null, "Which Tas would you like to delete", "Delete Task", JOptionPane.QUESTION_MESSAGE);
              report = mr.deleteTask(report, TaskNames, h);
              Developer = mr.deleteTask(report, TaskNames, h);
               TaskID = mr.deleteTask(report, TaskNames, h);
               TaskStatus = mr.deleteTask(report, TaskNames, h);
               TaskDuration = mr.deleteInt(TaskDuration, TaskNames, h);
                     TaskNames = mr.deleteTask(report, TaskNames, h);
                       
                       
                       }
           case 6:
               if(Menu == 6)
               {
                   break;
               }
            }
          
            }
            }
            }
        }
        
        
        case 2:
            
            if (choice == 2){
                
             JOptionPane.showMessageDialog(null,"Coming Soon");
             break;
            }
            
        case 3:
            if(choice  == 3){
                break;
            }
        }
    
   
       }
        
    }
    

    

