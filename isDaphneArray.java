package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class isDaphneArray {
	
	//List<Integer> array = new ArrayList<>();
	public int  isDaphneArray(List<Integer> array) {
		
		int max = Collections.max(array);
		int min = Collections.min(array);
		int indexMax= array.indexOf(max);
		int indexMin=array.indexOf(min);
		int maxCount = Collections.frequency(array, max);
		int minCount = Collections.frequency(array, min);
      
		if((maxCount==1&&minCount==1)&&(indexMax<indexMin))
		return 1;
		
		else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
        int[][] array = new int[2][2];
        array[0][0]=1;
        array[0][1]=2;
        array[1][0]=3;
        array[1][1]=4;
        int b1[] = Arrays.copyOfRange(array, [0,0], [0,1]);
		isDaphneArray obj = new isDaphneArray();
		List<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, -2, 3, -6, 9));
		System.out.println( obj.isDaphneArray(arr));  
		
	}

}
