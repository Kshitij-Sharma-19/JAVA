import java.util.Scanner;
public class ReverseTable {
	
   public static void utility(int n) {
	   int multiplier= 10;
	   while(multiplier>0) {
		   System.out.print(multiplier*n+" ");
		   multiplier--;
	   }
   }

   public static void main(String[] args) {
	  Scanner scanner =new Scanner(System.in);
	  int t = scanner.nextInt();
	  while(t-->0) {
		  int n = scanner.nextInt();
		  utility(n);
		  System.out.println();
	  }
	  scanner.close();
  }
}
