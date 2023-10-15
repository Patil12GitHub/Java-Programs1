package om;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("The element you enter in array");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The index no "+i+" ====> "+a[i]);
		}

	}

}
