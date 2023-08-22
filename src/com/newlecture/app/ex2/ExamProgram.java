package com.newlecture.app.ex2;

import java.io.FileOutputStream;

public class ExamProgram {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// 성적계산
   		kor1 = 50;
   		kor2 = 60;	
   		kor3 = 80;
   		
   		//성적 저장
   		FileOutputStream exam = new FileOutputStream(null)
   		
   		
   		
   		
   		
   		//성적 출력
	  	total = kor1 + kor2 + kor3;
	  	avg = total / 3;
		
      	 
	  	System.out.printf("total is %d\n" , total);
		System.out.printf("avg is %f\n" , avg);
	    
	}

}
