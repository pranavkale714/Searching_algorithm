package Binary_Search_demo;

public class Binary_Search {

	public static void main(String[] args) {
	int[] a= {2,3,4,5,6,15,20,24,42};
		
		int serach_element=2;
		int lower_index=0;
		int higher_index=a.length-1;
		int middle_index=(lower_index+higher_index)/2;
		
	    while(lower_index<=higher_index)
		{
		   if(a[middle_index]==serach_element)
		   { 
			  System.out.println("Found at "+(middle_index+1)+" Position");
			  break;
		   }
		   else if (serach_element>a[middle_index]) 
	       {	
			  lower_index=middle_index+1;
		   }
		   else
		   {
			  higher_index=middle_index-1;
		   }
		   middle_index=(lower_index+higher_index)/2;
	    }
	    if(lower_index>higher_index)
	    {
	    	System.out.println("element not found");
	    }

	}

}
