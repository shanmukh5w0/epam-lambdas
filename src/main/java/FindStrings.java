import java.util.*;
import java.util.stream.*;

public class FindStrings{

public static List<Object> findRequiredStrings(List<String> list) {
		
		return list.stream().filter(stringElement -> stringElement.startsWith("a") && stringElement.length()==3).collect(Collectors.toList());
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings in the list");
		int lengthOfList=sc.nextInt();
		List<String> stringlist= new ArrayList<String>();
		System.out.println("Enter the strings");
		for(int i=0;i<lengthOfList;i++)
			stringlist.add(sc.next());
	     List<Object> resultList = findRequiredStrings(stringlist); 
	     System.out.println(resultList);	
	}
}