
public class GUgudan {

	public static void main(String[] args) {
		int number[] = new int[45];
		
		for(int i=0; i<number.length; i++) {
			number[i] = i+1;
		}
		 int temp =0;
		 int j = 0;
		 
		 for(int i=1; i<200; i++) {
			 j = (int)(Math.random()*45);
			 temp = number[0];
			 number[0] = number[j];
			 number[j] = temp;
		 }
		 
		 for(int i=0; i<6; i++) {
			 System.out.print(number[i] + " ");
		 }
	}
}
