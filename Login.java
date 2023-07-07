/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10343509_poe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author thaba
 */
public class Login {
     public class Login_User {
    
     public static boolean CheckUserName(String Username){
         //This method will ensure a user username must conatin an underscore and be less than 5 characters
         return Username.contains("_") && Username.length() <= 5;
  }
    
     public static boolean CheckPasswordComplexity(String Password ){
      
    //code attribution
    // METHOD RECIEVED FROM A TUTOR
      
      
      Pattern p = Pattern.compile(" [@_#$!%&*()+=-?{}]");
      
      if (Password.length() < 9) {
      return false;
       
      }
      
       //the use of a matcher will ensure the user will implent a special character 
      Matcher n = p.matcher(Password);
      
         return n.matches();
     }
     
     
      public static   String RegisterUser (String Username, String Password ) {
       // this checks for both the username and password and whether they meet their criteria if noot either of the 2 messages will appear
    if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == false) {
        return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length and  Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special charcater ";
   
    //This will inform the user that their username has been captured but the password is incoreect
}else if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == true ) {
 return "Password is not correctly formatted, please ensure that the password contains atleast 8 characters, a capital letter, a number and a special charcater  ";
  
  //This will inform the user that their password has been captured but the username is incoreect
 }else if (CheckUserName(Username) == false && CheckPasswordComplexity(Password) == true ) {
 return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length  ";
 
  
} else {
 return "The username and password have been captured successfully ";
            
}
      }
      
        /**
         *
         * @param Username
         * @param Password
         * @param UserNameCheck
         * @param PassWordCheck
         * @return
         */
        public static boolean LoginUser (String Username, String Password, String UserNameCheck, String PassWordCheck ){

if (Username.equals(UserNameCheck)&& Password.equals(PassWordCheck)){
return true;
              
  }else{
return false;
        
  
}
        }
//This is what will displays when the information has been successfully captured
public static String ReturnLoginStatus(String success) {

if(success.equals("success")){
return "You have successfully logged in";
        
}else{
return "You have not been logged in ";

}


    
  }
    }
}
