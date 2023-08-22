package com.newlecture.app.ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class Program {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("res/data1.txt");
//		PrintStream fout = new PrintStream(fos, false, "UTF-8");
		PrintWriter fout2 = new PrintWriter(fos,true, Charset.forName("UTF-8"));
		
		fout2.write("문자열 전문 write");
		fout2.print("Hello");
		fout2.print(192827094942L);
		fout2.print("안녕하세요");
		System.out.print("hi");
		
		fout2.close();
		fos.close();
		
		
	}

}
