package interviewpgm;

public class ReverseString { // also use for palindrome

	public static void main(String[] args) {
		String str="Abhi";
		String rev = "";
		int len=str.length();
		//logic 1:
//		for(int i=len-1;i>=0;i--)
//		{			
//			rev=rev+str.charAt(i);
//			
//		}
		// logic 2:
//		char[] arr=str.toCharArray();
//		for(int i=len-1;i>=0;i--)
//			{			
//			   rev=rev+arr[i];
//				
//			}
		
	//Logic 3
		StringBuffer sb= new StringBuffer(str);
		
		System.out.println(sb.reverse());
	}

}
