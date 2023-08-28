package com.newlecture.app.ex3_string;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "수잔";
		String name2 = new String("수잔");
		
		System.out.println(name1 == name2); //같은 객체를 참조하고 있는지를 비교
		System.out.println(name1.equals(name2)); // 객체의 값이 같은를 비교
		System.out.println(name1 == "수잔");
		
		System.out.println("-------------------------------");
		
		String fileName = "Photh.jpg";
		System.out.println(fileName.length());
		int idx = fileName.indexOf(".");
		String name = fileName.substring(0,idx);
		System.out.println(name);
		
		//위의 파일명에서 확장자를 제외한 파일명만 출력하시오.
		//=위의 파일명에서 점(.)이 있는 곳까지의 문자열을 출력하시오.(단 점(.) 제외)
		
		int x = 3;
		Integer 정수갑옷 = Integer.valueOf(x); //new Integer(x); - Boxing
		int xl = 정수갑옷.intValue();// Unboxing
		
		String y = "hello";
		
		double d1 = 3.9;
		Double 더블갑옷 = Double.valueOf(d1);// new Double(d1);
		double d2 = 더블갑옷.doubleValue();// Unboxing
		
		int nl = 10;
		String sl = String.valueOf(nl);
		
		String s2 = "30.2";
		double n2 = Double.parseDouble(s2);
	}

}
  