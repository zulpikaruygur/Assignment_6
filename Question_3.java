package assignment_6;

public class Question_3 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		for(int i=7;i>=1;i--) {
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
