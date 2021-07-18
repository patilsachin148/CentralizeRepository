package actitimePageClass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class NewClass {
  public static void main(String[] args) {
	System.out.println("Hello");
	String s1 = new String("Mayur");
	String s2 = "MAYUR";
	String s3 = "MAY";
	String s4 = s3+"UR";
	System.out.println(s2==s4);
	
	
	
	String s11=new String("Hello");
    String s22=new String("Hello");
    System.out.println(s11+s22);
	

	System.out.println(s1==s2);
	//System.out.println(s1=s2);
	
	System.out.println(s1.equals(s3));
	
	System.out.printf(10+10+ s1);
			
	System.out.printf(s1+10+10);
	
	String[] arr = { "Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC","Java" };
	HashSet<String> set = new HashSet<String>();
	System.out.println("Duplicate Elements In array");
	for (String str : arr) {
		if (!set.add(str)) {
			System.out.println(str);
		}
	}
	
//	String str = "abcdabcdaeeeee";
//
//	HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
//
//	for (int i = 0; i <= str.length() - 1; i++) 
//	{
//		char charValue = str.charAt(i);
//		
//		if (mp.containsKey(charValue)) 
//		{
//			mp.put(charValue, (mp.get(charValue) + 1));
//		} else
//		{
//			mp.put(charValue, 1);
//		}
//
//	}
//	
//	
//	Set<Character> keys = mp.keySet(); //[a, b, c, d]
//	for (Character key : keys) {
//		System.out.println(key +": "+ mp.get(key));
//	}
	
}

}
