/*
Michael Mueller
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.HashMap;

/**
 *
 * @author miken
 */
public class ProgressDetails
{
   
     private int total=0;   
     private int totalProcessed=0;
    // a public static HashMap, which serves as a storage to store progress of different tasks
   // with taskId as key and ProgressDetails object as value
   public static HashMap<String, ProgressDetails> taskProgressHash = new HashMap<String, ProgressDetails>();
   {
 
   }
    
   public void setTotalProcessed(int totalProcessed) 
   {
      this.totalProcessed = totalProcessed;
   }
   
    public void setTotal(int total)
    {
      this.total = total;
   } 
   
}
