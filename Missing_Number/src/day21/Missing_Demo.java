package day21;

public class Missing_Demo {

	public static void main(String[] args) {
		int[] array = {8,5,2,6,7,1,9,10,4};
		
		
		int arraylength = array.length + 1;
		int sumOfAllNumbers = (arraylength * (arraylength + 1))/2;
		int sumofnum = 0;
		for(int i=0; i < array.length; i++ ) {
			sumofnum = sumofnum + array[i];
		}
		
		System.out.println("Missing number is  "+(sumOfAllNumbers-sumofnum));
		
	}
	}