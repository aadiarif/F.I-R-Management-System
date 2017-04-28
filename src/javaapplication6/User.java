/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DANI
 */
public class User implements userinterface{
public int r;
FileWriter fw;  
FileReader fr; 
Scanner sc;
    public User() throws IOException {
        this.sc = new Scanner(System.in);
        this.fr = new FileReader("news.txt");
        this.fw = new FileWriter("register.txt",true);
        this.r = 1;
    }
    /**
     *
     */
    public void userarea()
    {
    System.out.println("Welcome to User area!");
    System.out.println("Press 1 for Register, 2 for News!");
     
     int x=5;
     while(x>0)
     {
     int inp=sc.nextInt(); 
     if(inp==1)
     {
register();
     }
     else if(inp==2)
     {
     v_news();
     }
    
     else
     {
     System.out.println("Wrong input Try Again");
      x--;
     }}
    
    }
    @Override
   public void register(){
       System.out.println("Customer's list of F.I.R");
       char choice;
    
 do 
    {
        System.out.print("Enter your F.I.R Type: ");
    String outFileName = sc.nextLine();
        System.out.print("Enter your  F.I.R Name: ");
           String inFIR = sc.nextLine();
        sc.nextLine();
        System.out.print("Enter your Name: ");
           String inName = sc.nextLine();
        sc.nextLine();  
        
        System.out.print("Enter your Father Name: ");
           String inFName = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Enter your CNIC Number: ");
           String inNIC = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Enter your Permanent Address: ");
           String inAdd;
           inAdd = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Enter your Describtion of F.I.R: ");
           String inDes = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Enter the Name of Person You want to file F.I.R :");
           String inPer = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Enter if any witness:");
           String inWit = sc.nextLine();
        sc.nextLine();
        
        System.out.print("Want to file another F.I.R? Y/N: ");
           String inChoice = sc.nextLine();
           
           choice = inChoice.charAt(0);
        

           try {
               fw.write(inName+" ");
                fw.write(inFName+" ");
        fw.write(inNIC+" ");
        fw.write(inAdd+" ");
        fw.write(inDes+" ");
                fw.write(inPer+" ");
        fw.write(inWit+" ");
        fw.write(inDes+" ");
        
        fw.close();
           } catch (IOException ex) {
               Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
           }
               


       // inFName, inNIC,inAdd,inDes,inPer,inWit,inChoice);
    }
    while(choice == 'Y' | choice == 'y');
  
   }

   
    @Override
    public void v_news() {
    
          int i;    
    try {
        while((i=fr.read())!=-1)    
            System.out.print((char)i);
         fr.close(); 
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }
                }

    @Override
    public void askques() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void v_challan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
