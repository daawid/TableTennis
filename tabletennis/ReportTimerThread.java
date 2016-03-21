/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tabletennis;

/**
 *
 * @author jin
 */
public class ReportTimerThread implements Runnable {
   
    public ReportTimerThread(ReportGenerator report){
        
    }
      
    
    public void run(){
        while(true){
            try{
                Thread.sleep(1000);
            } catch(InterruptedException ie) {}
            System.out.println("hello");
        }
       
    }
    
}
