package com.newlecture.app.ex4.text.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("res/studentsl.data");
		Scanner fscan = new Scanner(fis);
		FileOutputStream fos = new FileOutputStream("res/sutentsl-out.data");
		PrintWriter fout = new PrintWriter(fos,true, Charset.forName("UTF-8"));
		
//		String line = null;
//		String name = null;
		
		{
		String line = fscan.nextLine();
		String name = line.substring(1,3);
		fout.println(name);
		}
		{
			String line = fscan.nextLine();
			String name = line.substring(1,3);
			fout.println(name);
			}
		{
			String line = fscan.nextLine();
			String name = line.substring(1,3);
			fout.println(name);
			}
		{
			String line = fscan.nextLine();
			String name = line.substring(1,3);
			fout.println(name);
			}
		{
			String line = fscan.nextLine();
			String name = line.substring(1,3);
			fout.println(name);
			}
		
		
	
		fscan.close();
		fis.close();
		fout.close();
		fos.close();
		

	}

}
