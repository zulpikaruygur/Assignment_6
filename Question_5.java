package assignment_6;

public class Question_5 {

	public static void main(String[] args) {
	 /* 1111111
		1111122
		1111333
		1114444
		1155555
		1666666
		7777777
		*/

		
		
		for(int i=1;i<=7;i++) {
			for(int j=7;j>=i+1;j--) {
				System.out.print("1");
			}
			for(int l=1;l<=i;l++) {
				System.out.print(i);
			
			}System.out.println();
		}
	}

}
