import java.util.*;
public class SCARR2 {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		n=sc.nextInt();
		int ARR[]= new int [10];
		System.out.println("Enter "+ n + " array elements");
		for (int i=0; i<n; i++) { 
		ARR[i]=sc.nextInt();
		}
		int max= ARR[0];
        for (int i=0; i<n;i++) {
        	if (ARR[i]>max)
        	{
        	  max=ARR[i];	
        	}
        }
        System.out.println("The largest element is "+ max);

	}

}
