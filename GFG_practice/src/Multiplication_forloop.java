import java.util.Scanner;
public class Multiplication_forloop {
	
	public static void utility(int n) {
		for(int i=1; i<=10;i++) {
			System.out.print(n*i+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t =scan.nextInt();
		while(t-->0) {
			int n = scan.nextInt();
			utility(n);
			System.out.println();
		}
		scan.close();

	}

}
