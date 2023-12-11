import java.util.Scanner;
public class charatevenindiceofString {
// print character at even index of string
	public static void utility(String S) {
		for(int i= 0; i<S.length(); i+=2) {
			System.out.print(S.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		while(T --> 0) {
			String S = sc.nextLine();
			utility(S);
			System.out.println();
		}
		sc.close();
	}
}
