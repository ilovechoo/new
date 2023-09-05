package com.newlecture.app.ex5.operator.bit;

import java.io.FileInputStream;
import java.io.IOException;


public class Program {

	public static void main(String[] args) throws IOException {
		//4바이트 데이터 읽기
		int n1;
		int n2;
		int n3;
		int n4;
		
		
	{
		// FileInputStream 객체 fis를 생성, 파일명은 re/picl.bmp 
		FileInputStream fis = new FileInputStream("res/pic1.bmp");
		
		//2바이트를 읽어서 버리기
		fis.read();
		fis.read();
		
		//추가로 4바이트는 정수형 변수 n1,n2,n3,n4에 저장
		n1 = fis.read(); //a byte of data, -1(int)
		n2 = fis.read(); 
		n3 = fis.read(); 
		n4 = fis.read(); 
			 
			
		
		//각 변수들을 "10,20,30,40"과 같은 포맷으로 콘솔에 출력
		System.out.printf("%x, %x, %x, %x\n", n1, n2, n3, n4);
		
		fis.close();
	}
	
	//크기 출력
	{
		// 4e,47,d,a -> 0A, 0D, 47, 4e
//		int size = n1; //[  ][  ][  ][5e]
						//[  ][  ][65][  ] n1<<<0
						//[  ][24][  ][  ] n2<<8
						//[00][  ][  ][  ] n4<<24
		int size =  n1<<0 |
					n2<<8 |
					n3<<16 |
					n4<<24;
		//삼항연산자
//		String result = (size>100000000)?"우와크다":"적당하다";
//		size = (size>10000000)?0:size; // 크기를 벗어나거나 유효하지 않은 값일 경우 기본 값으로 대치할 수 있다.
//		System.out.println(result);
		
		System.out.printf("size : %d\n", size);
		
	}
	}

	}
	
		
		
		
		
		
		
		
		 

	
