package dec8;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
    int [] arr = {3,2,5,6,8,7,1};
    Arrays.sort(arr);
    
    for (int i = 0; i < arr.length-1; i++) {
		
    	if (arr[i]+1 != arr[i+1]) {
			System.out.println((arr[i]+1));
		}	}
		
		
		
		
	}

}
