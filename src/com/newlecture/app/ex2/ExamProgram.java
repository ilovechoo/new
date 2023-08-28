package com.newlecture.app.ex2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Scanner;

public class ExamProgram {

	private static FileOutputStream fout;

	public static void main(String[] args) throws IOException  {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// 성적입력		
   		kor1 = 0;
   		kor2 = 0;	
   		kor3 = 0;
   		FileInputStream fis = new FileInputStream("res/exam.txt");
   		Scanner fscan = new Scanner(fis);
   		
//   		kor1 = fis.read();
//   		kor2 = fis.read();
//   		kor3 = fis.read();
//   		kor4 = fis.read();
//   		System.out.println(kor4);
   		
   		
   		fscan.nextLine();//"국어, 영어, 수학"
   		String line = fscan.nextLine(); //"30, 86, 100"
   		
   		String kor1_ = fscan.next(); //"30"
   		kor1 = Integer.parseInt(kor1_);
   		//System.out.println(kor1);
   		String kor2_ = fscan.next();
   		kor2 = Integer.parseInt(kor2_);
   		//System.out.println(kor2);
   		String kor3_ = fscan.next();
   		kor3 = Integer.parseInt(kor3_);
   		//System.out.println(kor3);
   		
   		fscan.close();
   		fis.close();
   		
 //   		int ch = fis.read();
//   		System.out.printf("%c\n", ch);
//   		ch = fis.read();
//   		System.out.printf("%c\n", ch);
//   		ch = fis.read();
//   		System.out.printf("%c\n", ch);
//   		ch = fis.read();
//   		System.out.printf("%c\n", ch);
   		
   		//성적 출력
	  	total = kor1 + kor2 + kor3;
	  	avg = total / 3;
		
   		
   		//성적 저장
   		FileOutputStream fos = new FileOutputStream("res/exam-out.txt");
   		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
		
   		//c, s, d(x|o), f(e)
		fout.printf("total is %d\n",total);
		fout.printf("avg is %f\n",avg);
		
		fout.close();
		fos.close();
   		
   		System.out.println("작업 완료");
		
	}

}
