package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharsInString {
	
	
	public void findDuplicateChars(String str)
	{
		String[] strone = str.split("");
		List<String> list = new ArrayList<String>(Arrays.asList(strone));
		Set<String> set = new HashSet<String>(list);
		int value;
		for(String s:set) {
			value = Collections.frequency(list, s);
			if(value > 1)
			{
				System.out.println(s + "\t" + "duplicates" + "\t" + value);
			}
		}
	}
	
	public void findDuplicateNumber(Integer [] num)
	{
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(num));
		System.out.println(list); 
	}
	
	public static int findMiddleIndex(int[] numbers) throws Exception {
		int endIndex = numbers.length-1;
		int startIndex = 0;
		int sumLeft = 0;
		int sumRight = 0;
		
		while(true){
			if(sumLeft>sumRight){
				sumRight += numbers[endIndex--];
			}else {
				sumLeft += numbers[startIndex++];
			}
			
			if(startIndex> endIndex){
				if(sumLeft == sumRight){
					break;
				}else {
					throw new Exception("Pass proper array");
				}
			}
		}
		return endIndex;
	}
	
	private static int[] removeDuplicates(int[] input) {
		Arrays.sort(input);
		
		int[] result = new int[input.length];
		int prev = input[0];
		result[0] = prev;
		
		for (int i = 0; i < input.length; i++) {
			int curr = input[i];
			
			if(prev != curr){
				result[i] = curr;
			}
			prev = curr;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		DuplicateCharsInString obj = new DuplicateCharsInString();
		obj.findDuplicateChars("Abdooadm");
		Integer [] number = {1,2,3,2,5};
		obj.findDuplicateNumber(number);
		
		int[] num = {2,4,4,2,5,4};
		try{
			System.out.println("MiddleIndex: " + findMiddleIndex(num));
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
        map.put("C++", 45);
        map.put("Ada", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("LISP & PASCAL", 93);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
        	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
        		return (o2.getKey()).compareTo(o1.getKey());
        	}
        });
        
        for (Map.Entry<String, Integer> entry : list) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
        
        int[][] test = new int[][]{
            {1, 1, 2, 2, 3, 4, 5},
            {1, 1, 1, 1, 1, 1, 1},
            {1, 2, 3, 4, 5, 6, 7},
            {1, 2, 1, 1, 1, 1, 1},};

            for (int[] input : test) {
	            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
	            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
	            System.out.println(input[4]);
	        }
	}
        
	
}
