package com.shika.testData;

public class factorial {

	public static void main(String[] args) {

		int a = 31;
		
		int flag =0;
		
		for(int i=2;i<a;i++) {
			
			if(a%i==0) {
				flag=1;
			}
		}
		
		if(flag==0) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}

}
