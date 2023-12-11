import java.util.Scanner;
public class NumberUntilZero {
	
	public static void utility(int x) {
		while(x!=-1) {
			System.out.printf("%d ",x);
			x--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt();
			utility(x);
			System.out.println();
		}
		sc.close();
	}

}
