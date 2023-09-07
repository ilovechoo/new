package com.newlecture.app.ex6.control.loop;

public class ForTestProgram {

	public static void main(String[] args) {
	
		for(int i =0; i<10; i++) {
		 System.out.printf("%d ", 1);
		}
		System.out.println();
	
		for(int i = 0; i<10; i++) { //index란? 0에서 시작하는 일렬번호 - index는 건드리지 않도록 하기
		System.out.printf("%d ", i+1);
			
		}
		System.out.println();
		
		for(int i = 0; i<10; i++) {
		System.out.printf("%d ", 10-i);
			
		}
		System.out.println();
		
		for(int i = 0; i<5; i++) {
			System.out.printf("%d ", i+3);
		}
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			if(i%2 != 0)
			System.out.printf("%d ", i);
		}
		System.out.println();
		
		for(int i=0, n=1; i<5; i++, n+=2)
			System.out.printf("%d ", n);
		System.out.println();
		
		for(int i=0, n=6; i<10; i++, n+=4) 
			System.out.printf("%d ", n);
		System.out.println();
		
		//an = a1+(n-1)d;
		//d=등차
		//for(int i = 0, n=1, an=6; i<10; i++, n++, an=6+(n-1)*4)
		for(int i = 0, n=1, an=6; i<10; i++, n++, an=4*n+2)
			System.out.printf("%d ", an);
		System.out.println();
			
		
		
		
		
		

	}
}