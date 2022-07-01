package encapsulation1;

public class palindrome {

	public static void main(String[] args) {
		  int x=12321;
		  int temp=x;
		      int  rev=0;
		        while(x!=0)
		        {
		            rev =rev*10+x%10;
		            x=x/10;
		        }
		        System.out.println(rev);
		        
		        if(rev==temp)
		        {
		            System.out.println("this number is palindrome");
		           // return true;
		         } else
		        {
		           System.out.println("this number is not palindrome");
		        //return false;
		        }
		        
		        
		        
		        
		    }

	}


