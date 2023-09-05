package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExamProgram {

	private static Object size;

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		Scanner fscan = new Scanner(fis);
		
		FileOutputStream fos = new FileOutputStream("res/pic2-copy.bmp");
		PrintWriter fout = new PrintWriter(fos);
		
		int n = fis.read();
		
		while(n != -1) {
			fos.write(n);
			n = fis.read();
		}
					
		fout.close();
		fos.close();
		
		fscan.close();
		fis.close();	
		
		System.out.println("작업완료");
	
	}

}
