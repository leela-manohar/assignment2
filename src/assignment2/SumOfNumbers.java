package assignment2;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int[] values= {100,52,43,99,42,40,91};
		int sum=0;
		for(int i=0;i<values.length-1;i++) {
			if(values[i]%2==0 && values[i]%5==0) {
				sum=sum+values[i];
			}
			
		}
		System.out.println(sum);

	}

}
