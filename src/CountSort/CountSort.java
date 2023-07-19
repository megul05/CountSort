package CountSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
	
	 public static int[] sort(int[] array){
	        int maxValue = Integer.MIN_VALUE, minValue = Integer.MAX_VALUE;
	        for (int values : array){
	            minValue = Math.min(minValue, values);
	            maxValue = Math.max(maxValue, values);
	        }
	        int countArray[] = new int[maxValue + 1];
	        for (int elements : array){
	            countArray[elements]++;
	        }
	        int index = 0;
	        for (int iterator = minValue ; iterator <= maxValue ; iterator++){
	            int temp = countArray[iterator] ;
	            while (temp > 0){
	                array[index] = iterator;
	                index++;
	                temp--;
	            }
	        }
	        return array;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		int result[] = sort(arr);
		for(int i=0;i<size;i++)
		{
			System.out.println(result[i]);
		}

	}

}
