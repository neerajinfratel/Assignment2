class PrimeNum
{      
     public static String checkPrime(int num)
	 { 
	    if(num==2|| num==3) return(Integer.toString(num)+" ");
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{	
				return "";
			} 	
		}	   
		return(Integer.toString(num)+" ");	
	 }

	public static void main(String args[])
	{
		System.out.print("Enter Number :");
		int n = Integer.parseInt(System.console().readLine());	
		if(n<0) System.out.println("Number Is Negative");
		
		for(int i=2;i<=n;i++)
		{
			System.out.print(checkPrime(i));
			
		}		
		
	}
	
}