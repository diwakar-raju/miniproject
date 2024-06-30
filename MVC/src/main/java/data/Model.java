package data;

public class Model {
		public static boolean palindrome(int n)
		{
			int dig,r=0;
			int t=n;
			while(n!=0)
			{
				dig=n%10;
				r=r*10+dig;
				n=n/10;
			}
			if(t==r)
			{
				return true;
			}
			else
				return false;
			
			
		}
} 
