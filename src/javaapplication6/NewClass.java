/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DANI
 */
class NewClass {
    public void start() throws IOException
    {
    System.out.println("Welcome to FIR management system!");
    System.out.println("Press 1 for User, 2 for Police, 3 for Admin");
     Scanner sc=new Scanner(System.in);
     int x=5;
     while(x>0)
     {
     int inp=sc.nextInt(); 
     if(inp==1)
     {
     User u=new User();
     u.userarea();
     }
     else if(inp==2)
     {
     Police p=new Police();
     p.policearea();
     }
     else if(inp==3)
     {
     Admin a=new Admin();
     a.adminarea();
     }
     else
     {
     System.out.println("Wrong input. Try Again");
      x--;
     }}
    
    }
    
}
