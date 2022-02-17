package interviewpgm;

public class SwapTwoNos { // we have 5 logics

	public static void main(String[] args) {
		
		int a=10,b=20;
		/*logic-1: use 3rd variable
				int t; 
		      t=a;a=b;b=t;
		 */
		// logic-2: use + and - operator
		  // a=a+b; b=a-b; a=a-b;
		
		// logic-3: use * and / operator
		  // a=a*b; b=a/b; a=a/b;
		   
		// logic-4 : use char ^ opertor 
		     //a=a^b; b=a^b; a=a^b;
		// logic-5 : use char single statement
		   b=a+b-(a=b);
		
		System.out.println("a:"+a+"     "+"b:"+b);
		

	}

}
