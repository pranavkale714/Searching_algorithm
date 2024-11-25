package Linear_Search_Demo;

public class Linear_Search_Integer {

	public static void main(String[] args) {
	 int a[]= {5,4,34,33,31,35,37};
	 int temp=0;
	 int search_element=35;
	 
	 for(int i=0;i<a.length;i++)
	 {
		 if(a[i]==search_element)
		 {
			 temp=a[i];
			 System.out.println("element found at position "+(i+1));
		 }
	 }
	 if(temp==0)
	 {
		 System.out.println("element not found");
	 }
	}

}
