package Linear_Search_Demo;

public class Linear_Search_String {

	public static void main(String[] args) {
		String a[]= {"pranav","dilip","kale"};
		 String temp="Not Found";
		 String search_element="kale";
		 
		 for(int i=0;i<a.length;i++)  
		 {  
			 if(a[i].equals(search_element))
			 {
				 temp="Found";
				 System.out.println("element found at position "+(i+1));
			 }
		 }
		 if(temp.equals("Not Found"))
		 {
			 System.out.println("element not found");
		 }
	}
}
