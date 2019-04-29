package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchPattern {
	
	public static void main(String[] args) {
		
//		//1st way  
//		Pattern p = Pattern.compile("1213");//. represents single character  
//		Matcher m = p.matcher("11122113");  
//		boolean b = m.matches();  
//		System.out.println(b);
		
		List<Integer> pattern = new ArrayList<Integer>(Arrays.asList(1,1,1,2,2,1,1,3));
		List<Integer> Matcher = new ArrayList<Integer>(Arrays.asList(1,2,1,3));
		List<Integer> newMatcher = new ArrayList<Integer>();
		newMatcher.add(pattern.get(0));
		for(int i:pattern) {
			if(i!=newMatcher.get(newMatcher.size()-1)) {
				newMatcher.add(i);
			}
		}
		


		
System.out.println(Matcher.equals(newMatcher));
	}


}
