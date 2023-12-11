// 5*5 matrix
public class BasicStarPattern {

	public static void basicStar() {
		/* *****
         *****
         *****
         ***** 
         ***** */
		int i=1;
		while(i<=5) {
			int j =1;
			while(j<=5) {
				System.out.print("*");
				j++;
				
			}System.out.println();
			i++;
		}
	}
	public static void increaseStar() {
	/*	*
		**
		***
		****
		***** */
		int i =1;
		while(i<=5) {
			int j =1;
			while(j<=i) {
				System.out.print("*");
				j++;
			} 
			System.out.println();
			i++;
		}
	}
	public static void fiveStarRow() {
	//  *****
		int i=1;
		while(i<=5) {
			System.out.print("*");
			i++;
		}
		System.out.println();
	}
	public static void fiveStarColomn() {
	/* *
	   * 	
	   * 
	   * 
	   * */
		int i =1;
		while(i<=5) {
			System.out.println("*");
			i++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		basicStar(); 
		System.out.println();
		increaseStar();
		System.out.println();
		fiveStarRow();
		System.out.println();
		fiveStarColomn();

	}

}
