package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class breakcontinue {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/exam.list");
		Scanner fscan = new Scanner(fis);
		
		
//		while(fscan.hasNext()) {
//		
//		String word = fscan.next();
//		int kor = Integer.parseInt(word);
//		System.out.printf("%d,",kor);
//		
//		
//		}
	
		
//		for(int i=0; fscan.hasNext(); i++) {
//			String word = fscan.next();
//			int kor = Integer.parseInt(word);
//			
//			if(i>=5)
//				break;
//			
//			System.out.printf("%d,",kor);
//		
//		}
		
		for(int i=0; fscan.hasNext(); i++) {
			String word = fscan.next();
			int kor = Integer.parseInt(word);
			
			if(i<4)
				continue;
			
			System.out.printf("%d,",kor);
		
		}
		
		
		
		
		fscan.close();
		fis.close();
		

	}

}
