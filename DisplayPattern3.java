class DisplayPattern3
{
	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());		
		
		for(int i=1;i<=n;i++)
		{
			 for(int j=i; j>=1; j--)
			 {
				 System.out.print(j);
			 }
			 System.out.print("\n");
			
		}		
		
	}
	
}