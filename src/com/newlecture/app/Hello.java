/*
작성일 : 2023년 8월 16일
작성자 : ilovechoo
*/
package com.newlecture.app;

class Hello{
	public static void main(String[ ] args){
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		// 성적계산
   		kor1 = 50; //0보다 크고 100보다 작은 값으로 대입
   		kor2 = 60;	
   		kor3 = 80;
   		byte x = (byte)300; //2^7-1
   		
	  	 total = kor1 + kor2 + kor3;
	  	 avg = total / 3;
		
      	 //성적 출력
	  	System.out.printf("total is %d\n" , /* 정수 값*/ total);
		System.out.printf("avg is %f\n" , avg);
	    
		}
  	}

