package com.newlecture.app.ex1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("res/data.txt");
		
		fout.write(40);
		fout.write(65);
		fout.write(100);
		fout.write('9');
		fout.flush(); 
		

		fout.close();
		
		char st = '0';
		System.out.println();

	}

}
