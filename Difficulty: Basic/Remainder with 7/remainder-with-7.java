//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			Solution obj = new Solution();
			System.out.println(obj.remainderWith7(str));
		t--;
		
System.out.println("~");
}
	}
}
// } Driver Code Ends


class Solution
{
    // Complete the function
    int remainderWith7(String num)
    {
        int rem=0;
        
        for(int i=0;i<num.length();i++)
        {
            int result=num.charAt(i)-'0';
            rem=(rem*10+result)%7;
        }
        return rem;
    }
}
