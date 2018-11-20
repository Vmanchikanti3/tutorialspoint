package variables;

public class Loops {

	public static void main(String[] args) {
		int input= 5;
		int oddnumber=1;
		int sum=0;
		for(int i=0; i<input; i++) {
			System.out.println(oddnumber);
			sum=sum+oddnumber;
			oddnumber=oddnumber+2;
			
		}
		
	System.out.println("sume of the n odd numbers"  + sum);

	}

}
