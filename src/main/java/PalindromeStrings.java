import java.util.*;
import java.util.function.Predicate;

public class PalindromeStrings{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of strings in list");
		int lengthOfList=sc.nextInt();
		System.out.println("Enter the strings");
		String[] stringlist=new String[lengthOfList];
		for(int i=0;i<lengthOfList;i++)
			stringlist[i]=sc.next();
        
        List<String> palindromeList = PalindromeStrings.searchForPalindrome(Arrays.asList(stringlist), str -> PalindromeStrings.checkIfPalindrome(str));
        System.out.println("Palindromes in the given list are: " + palindromeList);
    }
 
	 public static List<String> searchForPalindrome(List<String> list, Predicate<String> predicate) { 
	    	List<String> palindromeslist = new ArrayList<>(); 
	    	list.stream().filter(iterator -> (predicate.test(iterator))).forEach(iterator ->{
	            palindromeslist.add(iterator);
	        
	    	});
	        return palindromeslist;
	 
	    }
	 
    public static boolean checkIfPalindrome(String string) {
    	StringBuilder reverse =new StringBuilder();
    	for(int i = string.length()-1; i>= 0 ; i--)
    	     reverse = reverse.append(string.charAt(i));
    	
    	return string.equalsIgnoreCase(reverse.toString());
        } 
    
   
    
}