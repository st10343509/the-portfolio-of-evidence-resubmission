/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10343509_poe;

import javax.swing.JOptionPane;
import org.apache.commons.lang3.ArrayUnits;

/**
 *
 * @author thaba
 */
public class MenuArrays {
  public void Done(String[]Developer, String[]TaskNames,String[] TaskStatus,int[]Duration)
    {
      for(int i =0;i<   TaskStatus.length;i++)
      {
          if(TaskStatus[i].equalsIgnoreCase("Done"))
          {
              JOptionPane.showMessageDialog(null, "The Task Name: " + TaskNames[i] + " " + "\nThe Developer Details: " + Developer[i] + " " + "\nThe duration of the task: " + Duration[i]+ " ");
          }
      }
    }
        public void FindTask(String[] TaskNames, String[] Developer,String[] Taskstatus,String loc)
        {
           for(int i =0;i<   TaskNames.length;i++)
           {
           
           if(TaskNames[i].equalsIgnoreCase(loc))
           {
            JOptionPane.showMessageDialog(null, "The TTask Name: " + TaskNames[i] + " " + "The Developer Details: " + Developer[i] + " "+ "Task Status: " + Taskstatus[i]);
           }
           
           
           }
           
        }
        public void Report(String[] report )
        {
            
           
         for(int i =0;i<   report.length;i++)
         {
         JOptionPane.showMessageDialog(null, report[i]);
         
         }
         
        
        
        }
        public void LongestTask(int[] Duration1,String [] Developer)
        {
        int longest = 0;
        
        for(int i =1;i< Duration1.length;i++)
        {
         if(Duration1[i]> Duration1[longest])
         {
             longest = i;
         }
            
        }
        JOptionPane.showMessageDialog(null, " " + "The Developer Details are: " +Developer[longest] + " " + " Task Status:" + Duration1[longest]);
        
        }
        
        public String[] deleteTask(String[] results, String[] TaskNames, String h)
        {
            String[] pItem = new String[TaskNames.length];
            
            for(int i=0; i<TaskNames.length; i++)
            {
             if(TaskNames[i].equalsIgnoreCase(h))
             {
              pItem = ArrayUnits.Remove(results,i);   
             }
            }
            
            return pItem;
        }
        
        public int[] deleteInt(int[] results, String[] TaskNames, String h)
                
        {
          int[] pItem = new int [TaskNames.length];
            
            for(int i=0; i<TaskNames.length; i++)
            {
             if(TaskNames[i].equalsIgnoreCase(h))
             {
              pItem = ArrayUnits.Remove(results,i);     
            
        }
    }
 
}

    
