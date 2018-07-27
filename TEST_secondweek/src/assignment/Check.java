package assignment;



import java.util.Arrays;

public class Check {

	static boolean checkTripplets( int arr[])
	{
		int n = arr.length;
        
        
		int flag=0;
	int counter=0;
	
		for(int i=0;i<n-3;i++)
		{
			int j=i+1;		
				while(arr[i]==arr[j])
				{
					counter=counter+1;
							j=j+1;
					
							if(counter==2)
							{
								flag=1;
								break;
							}
							
				}
				
				
						
			}
		
		if(flag==1)
			return true;
		else
		return false;
		
	}
}
