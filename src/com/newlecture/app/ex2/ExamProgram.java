package com.newlecture.app.ex2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ExamProgram {

	private static FileOutputStream fout;

	public static void main(String[] args) throws IOException  {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// 성적계산
   		kor1 = 50;
   		kor2 = 60;	
   		kor3 = 80;
   		
   		//성적 저장
   		FileOutputStream fos = new FileOutputStream("res/exam.txt");
   		PrintWriter fout = new PrintWriter(fos, true, Charset.forName("UTF-8"));
   			
//		fos.write(kor1);
//		fos.write(kor2);
//		fos.write(kor3);
	
		fout.print(kor1);
		fout.print(kor2);
		fout.print(kor3);
		
		fout.close();
		fos.close();
   		
   		//성적 출력
	  	total = kor1 + kor2 + kor3;
	  	avg = total / 3;
		
      	 
	  	System.out.printf("total is %d\n" , total);
		System.out.printf("avg is %f\n" , avg);
	    
	}

}
