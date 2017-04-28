/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.BufferedWriter;
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
public class Police implements Policeinterface {
FileWriter fw;  
FileReader fr; 
Scanner sc;
BufferedWriter bw;
public Police()throws IOException
{
        this.sc = new Scanner(System.in);

}
public void policearea()
    {
    System.out.println("Welcome to Police area!");
    System.out.println("Press 1 for View complains, 2 for Actions, 3 for News");
        //    + "// 4 for Questions, 5 for Emergency, 6 for Challan!);
     
     int x=5;
     while(x>0)
     {
     int inp=sc.nextInt(); 
     if(inp==1)
     {
      v_complains();     }
     else if(inp==2)
     {
         actions();     }
     else if(inp==3)
     {
          news();     }
     else if(inp==4)
     {
       v_ques();     }
     else if(inp==5)
     {
         emergency();     }
     else if(inp==6)
     {
        challan();     }
    
     else
     {
     System.out.println("Wrong input. Try Again");
      x--;
     }}
    
    }
    @Override
    public void v_complains() {

    int i;    
    try {
                this.fr = new FileReader("register.txt");

        while((i=fr.read())!=-1)    
            System.out.print((char)i);
         fr.close(); 
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }
 }

    @Override
    public void actions() {
System.out.println("Enter proves: ");
   String proves;
    proves = sc.next();
    System.out.println("Enter witness: ");
   String witness;
    witness = sc.next();
    System.out.println("Action against criminal: ");
   String c_criminal;
    c_criminal = sc.next();
    
  
    try {
                this.fw = new FileWriter("actions.txt",true);
                this.bw=new BufferedWriter(fw);

        fw.write(c_criminal+" ");
bw.newLine();
        fw.write(witness+" ");
bw.newLine();
        fw.write(proves+" ");
       // bw.newLine();
        fw.close();
       // bw.close();
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }    }

   

   

    @Override
    public void news() {
System.out.println("Enter news: ");
   String news;
    news = sc.next();
  
    try {
                this.fw = new FileWriter("news.txt",true);

        fw.write(news+" ");
        fw.close();
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }            }

    

    @Override
    public void v_ques() {
 int i;    
    try {
                this.fr = new FileReader("ques.txt");

        while((i=fr.read())!=-1)    
            System.out.print((char)i);
         fr.close(); 
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }    }

    @Override
    public void v_feedback() {
 int i;    
    try {
                this.fr = new FileReader("feedback.txt");

        while((i=fr.read())!=-1)    
            System.out.print((char)i);
         fr.close(); 
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }    }

    @Override
    public void emergency() {
 int i;    
    try {
                this.fr = new FileReader("emergency.txt");

        while((i=fr.read())!=-1)    
            System.out.print((char)i);
         fr.close(); 
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }    }

    @Override
    public void challan() {
System.out.println("Enter challan ");
   String cha;
    cha = sc.next();
  
    try {
                this.fw = new FileWriter("cha.txt",true);

        fw.write(cha);
        fw.close();
    } catch (IOException ex) {
        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
    }            }
    
}
