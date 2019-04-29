package test;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//import java.util.StringTokenizer;

public class MaxDuplicateWordCount {
	
	public Map<String, Integer> getWordCount(String fileName){
		FileInputStream fis = null;
		DataInputStream dis = null;
		BufferedReader br = null;
		
		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		try{
			fis = new FileInputStream(fileName);
			dis = new DataInputStream(fis);
			br = new BufferedReader(new InputStreamReader(dis));
			String line = null;
			while((line=br.readLine())!=null){
				String[] str = line.split("");
				
				for(String s:str)
				{
					String tmp=s.toLowerCase();
					if(wordMap.containsKey(tmp)){
						wordMap.put(tmp, wordMap.get(tmp)+1);
						
					}
					else {
						wordMap.put(tmp, 1);
						
					}
					
				}
				//StringTokenizer st = new StringTokenizer(line," ");
//				while(st.hasMoreTokens()){
//					String tmp = st.nextToken().toLowerCase();
//					if(wordMap.containsKey(tmp)){
//						wordMap.put(tmp, wordMap.get(tmp)+1);
//					}else {
//						wordMap.put(tmp,1);
//					}
//				}
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!= null){
					br.close();
				}
				
			} catch (Exception e2) {
			}
		}
		return wordMap;
	}
		public void printTwoMaxNumber(int[] num){
			int maxOne = 0, maxTwo = 0;
			for (int i : num) {
				if(maxTwo < i){
					maxOne=maxTwo;
					maxTwo = i;
				}
//				else if(maxTwo < i){
//					maxOne=maxTwo;
//					maxTwo = i;
//
//				}
			}
			System.out.println("Maximum numbers are: "+maxOne+" & "+maxTwo);
		}
		
		
	
	
	
	
	public static void main(String[] args) {
		
		MaxDuplicateWordCount mdc = new MaxDuplicateWordCount();
		Map<String, Integer> wordMap = mdc.getWordCount("/home/ked/Pictures/input.txt");
		System.out.println(wordMap);
		
		int num[] = {5, 34, 78, 2, 45, 1, 99, 23};
		//Maxtwo mx = new Maxtwo();
		mdc.printTwoMaxNumber(num);


}
}
