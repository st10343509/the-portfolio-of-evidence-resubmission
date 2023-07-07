/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10343509_poe;


import javax.swing.JOptionPane;


/**
 *
 * @author thaba
 */
public class Task {

    public  boolean checkTaskDescription(String Description){
       
        if (Description.length() < 50) {
           
            
            JOptionPane.showMessageDialog(null, "This task has been successfullt captured");
            return true;
            
        }else{
             JOptionPane.showMessageDialog(null, "Please enter a task descirption of less than 50 characters");
            return false;
        
    }
}


 public  String createTaskID(String Tname, String DeveloperDetails, int Tnumber ){
// This will autogenerate the ID 
    String TID= Tname.substring(0,2)+ ":" +Integer.toString(Tnumber)+ ":" + DeveloperDetails.substring(DeveloperDetails.length()-3);
    return TID.toUpperCase();
    
      }

 
String DISPLAY;

public String printTaskDetails(String Tstatus, String DeveloperDetails, int Tnumber, String Tname, String Description, String TID, int Duration ){
  
    
    DISPLAY = "The status:" +Tstatus+ "\n\t The developer details: " +DeveloperDetails+ "\n\t The task number is: "+ Tnumber+ "\n\t The description is: " +Description+ "\n\t The ID is: " +TID+ "\n\t The duration is:" +Duration ;

return DISPLAY;
}

public int returnTotalHours(int Duration, int Totalhrs){
    Duration = Duration + Totalhrs;
    return Duration;
}


}