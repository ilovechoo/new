package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/pic2.bmp");
		Scanner fscan = new Scanner(fis);
		
		FileOutputStream fos = new FileOutputStream("res/pic2.bmp");
		PrintWriter fout = new PrintWriter(fos);
		
//		int n = fis.read();
//		while(n != -1) {
//			fos.write(n);
//			n = fis.read();
		
		int n = -1;
		while((n = fis.read()) != -1); //중괄호는 안쓰는 것이 좋다 - 가독성 떨어짐
		  fos.write(n);
		  
		
					
		fout.close();
		fos.close();
		fscan.close();
		fis.close();	
		
		System.out.println("작업완료");
	
	}

}
