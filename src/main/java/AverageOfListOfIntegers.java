import java.util.*; 
import java.util.stream.IntStream; 

public class AverageOfListOfIntegers{
	 

	public static void main(String[] args) 
	    {
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the no of Integers in the list");
		    int noOfElements=sc.nextInt();
		    int[] array=new int[noOfElements];
		    System.out.println("Enter the list of Integers");
		    for(int i=0;i<noOfElements;i++)
		    	array[i]=sc.nextInt();
	       
		    IntStream inpstream = IntStream.of(array); 
	        OptionalDouble od = inpstream.average(); 
	        if (od.isPresent()) 
	        { 
	            System.out.println(od.getAsDouble()); 
	        } 
	        else 
	        { 
	            System.out.println("-1"); 
	        }
	    
	 } 

}
