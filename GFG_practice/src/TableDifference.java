import java.util.Scanner;
//Table Difference problem:
/*Given two number n1 and n2, n1 > n2. 
 Find the differences between mathematical tables of n1 and n2.*/
public class TableDifference {

	public static void tableOfDifference(int n1, int n2) {
		int n =n1-n2;
		int i = 1;
		while(i<11) {
			System.out.print(n*i+" ");
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-->0) {
			int n1 =scan.nextInt();
			int n2 =scan.nextInt();
			tableOfDifference(n1,n2);
			System.out.println();
		}
		scan.close();

	}

}
