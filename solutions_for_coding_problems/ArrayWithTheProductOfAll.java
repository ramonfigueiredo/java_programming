import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayWithTheProductOfAll {

	public static void main(String args[]) {
		int[] arr1 = {3, 2, 1};
		int[] new_arr = getArrayWithTheProductOfAll(arr1);
		// New array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i
		System.out.println("New array using [3, 2, 1] input array: " + Arrays.toString(new_arr));

		int[] arr2 = {1, 2, 3, 4, 5};
		new_arr = getArrayWithTheProductOfAll(arr2);
		System.out.println("New array using [1, 2, 3, 4, 5] input array: " + Arrays.toString(new_arr));
	}
	
	public static int[] getArrayWithTheProductOfAll(int[] arr) {
		int[] new_arr = new int[arr.length];

		int idx = 0;
		for(int i : arr) {
			int prod = 1;
			for(int j : arr) {
				if(i != j)
					prod = prod * j;
			}
			new_arr[idx] = prod;
			idx++;
		}

		return new_arr;
	}
}