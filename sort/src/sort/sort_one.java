package sort;

import java.util.Scanner;
public class sort_one {
	public static void main(String args[]) {
		int a[] = new int[5];
		Scanner scan = new Scanner(System.in);
		int i,j,temp;
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		for(i=1;i<a.length;i++) {
			temp=a[i];
			for(j=i-1;j>=0&&a[j]>temp;j--) {
				a[j+1]=a[j];
			}
			a[j+1]=temp;
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
			
	}
}
