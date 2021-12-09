package dec9;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println("Second largest number in Array:"+data[data.length-2]);
		
		
		int length = data.length;
		System.out.println(length);
	}

}
