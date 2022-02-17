package interviewpgm;

import java.util.Scanner;

public class ReverseNumber { // 3 ways we have // also use for palindrome


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number is");
		int num=sc.nextInt();
		int rev=0;
//logic 1:		
//		while(num!=0) {
//			rev=rev*10 + num%10;  
//			num=num/10;
//						
//		}
		//logic 2: use StringBuffer class
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
		//logic 3: use StringBuilder class
		StringBuilder sb=new StringBuilder();
		sb.append(num);
	System.out.println("Reverse number is:"+sb.reverse());
	}

}
