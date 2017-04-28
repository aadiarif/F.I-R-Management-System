package javaapplication6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 *  and open the template in the editor.
 */
import java.util.*; 
import java.io.*; 
import java.io.IOException;
/**
 *
 * @author adeel arif
 */
public class FIR {
   public static void main(String[] args, String outFileName, String inName, String inFName, String inNIC, String inAdd, String inDes, String inPer, String inFIR, String inWit, String inChioce, String inChoice, char choice) throws IOException
   {
       //int num=0;
       //String Name = "";
       
File f=new File("sample.dat");

Scanner input=new Scanner(f);
System.out.println("Customer's list of F.I.R");

try 
{
    System.out.print("Enter your F.I.R Type: ");
    outFileName =input.nextLine();
    
    File c = new File(outFileName);
    
    //use a printwriter object to write file
    PrintWriter ofstream = new PrintWriter(f);
    
    
    do 
    {
        System.out.print("Enter your  F.I.R Name: ");
        inFIR = input.nextLine();
        input.nextLine();
        System.out.print("Enter your Name: ");
        inName = input.nextLine();
        input.nextLine();  
        
        System.out.print("Enter your Father Name: ");
        inFName = input.nextLine();
        input.nextLine();
        
        System.out.print("Enter your CNIC Number: ");
        inNIC = input.nextLine();
        input.nextLine();
        
        System.out.print("Enter your Permanent Address: ");
        inAdd = input.nextLine();
        input.nextLine();
        
        System.out.print("Enter your Describtion of F.I.R: ");
        inDes = input.nextLine();
        input.nextLine();
        
        System.out.print("Enter the Name of Person You want to file F.I.R :");
        inPer = input.nextLine();
        input.nextLine();
        
        System.out.print("Enter if any witness:");
        inWit = input.nextLine();
        input.nextLine();
        
        System.out.print("Want to file another F.I.R? Y/N: ");
        inChoice = input.nextLine();
        choice = inChoice.charAt(0);
        

        writeFileData(inName, inFName, inNIC,inAdd,inDes,inPer,inWit,inChoice);
    }
    while(choice == 'Y' | choice == 'y');
    
    ofstream.close();
        
    }        
    catch (IOException e)
    {
        System.out.append("File Error");
    }

    }
public static void writeFileData(String inName, String inFName, String inNIC, String inAdd, String inDes, String inPer, String inWit, String inChoice) throws FileNotFoundException
{
    File f=new File("sample.dat");
    PrintWriter pw;
       pw = new PrintWriter(f);
    
   // OutputStream.write("%Sd %20s%n",inName, inFName, inNIC,inAdd,inDes,inPer,inWit,inChoice);
pw.format("%Sd %20s%n",inName, inFName, inNIC,inAdd,inDes,inPer,inWit,inChoice);}
    
}

