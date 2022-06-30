package com.company.locker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class LokedMe 
{

	private static final String ProjectPath = "E:\\Simply learn\\Phase1-Project\\LockedMe";


	public static void displayMenu()
	{
		System.out.println("********************************************");
		System.out.println("\tWelcome to Company Lockers Pvt. Ltd :- LockedMe.com");
		System.out.println("\tDeveloper Name : Venkatesan Arumugam");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.println("\t1.Get all the File");
		System.out.println("\t2.Create a new file");
		System.out.println("\t3.Delete a file");
		System.out.println("\t4.Serch a file");
		System.out.println("\t5.Exit");
		System.out.println("***********************************************");
	}
	
	public static void getAllFiles()
	{
		
		
		File folder = new File(ProjectPath);
		
		File [] ListOfFiles = folder.listFiles();
		
		//File [] ListOfFile = new File(ProjectPath).listFiles();
		
		if (ListOfFiles.length==0)
		{
			System.out.println("There is no file in the directory");
		}
		else
		{
			System.out.println("Retrival All Files ");
			//for(var l : ListOfFiles)
			for(File l : ListOfFiles)
			{
				System.out.println(l.getName());
			}
		}
		
	}
	public static void createNewFiles()
	{
		System.out.println("New File Creation");
		
		
		try {Scanner scan = new Scanner(System.in);
		
		String fileName;
		int LinesCount;
		
		System.out.println("Enter the File Name : ");
		fileName = scan.nextLine();
		System.out.println("Enter the LinesCount: ");
		//LinesCount = Integer.parseInt(scan.nextInt());
		  LinesCount=Integer.parseInt(scan.nextLine());
		
			FileWriter fw = new FileWriter(ProjectPath+"\\"+fileName);
			
			for(int i =1; i<=LinesCount; i++)
			{
				System.out.println("Enter the content : ");
				fw.write(scan.nextLine());
				
			}
			System.out.println("New file Created Successfully");
			fw.close();
			
		} catch (IOException e) {
			
			System.out.println(e);
		}
		
		
	}
	public static void deleteFile()
	{
		System.out.println("File Deletion");
		
		Scanner scan = new Scanner(System.in);
		String fileName;
		System.out.println("Enter the file name : ");
		
		fileName = scan.nextLine();
		
		File f = new File(ProjectPath+"\\"+fileName);
		
		if(f.exists())
		{
			f.delete();
			System.out.println("File deleted successfully");
			}
		else
		{
			System.out.println("File is not exist");
		}
		
		
	}
	public static void searchFiles()
	{
		System.out.println("To Search a file");
		
		Scanner scan = new Scanner(System.in);
		try {
		String fileName;
		
		System.out.println("Enter the File Name : ");
		
		fileName = scan.nextLine();
		
		File f = new File(ProjectPath+"\\"+fileName);
		
		if(f.exists())
		{
			System.out.println("File is Available : "+f.getName());
		}
		else
		{
			System.out.println("File is not Available");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

	public static void main(String[] args)
	{
	
		Scanner scan = new Scanner(System.in);
		
		int m;
		try {
	do {
		displayMenu();
		
		System.out.println("Enter your choise : ");

		m = Integer.parseInt(scan.nextLine());
		
		switch (m)
		{
			case 1: getAllFiles();
			          break;
			case 2 : createNewFiles();         
			          break;
			case 3 : deleteFile();
			          break;
			case 4 : searchFiles();
			          break;
			case 5 : System.exit(0);
			          break;
			default : System.out.println("Invalid option");
		}
	}while(m>0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	
	

}
