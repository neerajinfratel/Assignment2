class AliquotSum
{      
     public static int sum(int num)
	 { 
	    int s=0;
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
			{	
				s=s+i;
			} 	
		}	   
		return(s);	
	 }

	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());	
		if(n<0) System.out.println("Number Is Negative");
		System.out.print(sum(n));				
		
	}
	
}