// 12Th OCtober 2023
import java.util.Scanner;
public class FactorialNum {
	public static int factNum(int n) {
		if (n == 0) {
			return 1;
		}
		return n*factNum(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("No. of test cases: ");
		int t = sc.nextInt();
		while(t-->0) {
			System.out.println("Enter the number for factorial: ");
			int num = sc.nextInt();
			System.out.println(factNum(num));
		}
        sc.close();
	}

}
