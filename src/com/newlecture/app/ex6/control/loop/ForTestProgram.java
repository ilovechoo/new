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

	}
}