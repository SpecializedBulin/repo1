package sort;

import java.util.Scanner;
public class sort_two {
	public static void main(String args[]) {
		int a[] = new int[10];
		Scanner scan =  new Scanner(System.in);
		int i,j,temp;
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
		int gap;
		for(gap=a.length/2;gap>0;gap=gap/2) {
			for(i=gap;i<a.length;i++) {
				j=i;
				while(j-gap>=0&&a[j]<a[j-gap]) {
					temp=a[j-gap];
					a[j-gap]=a[j];
					a[j]=temp;
					j=j-gap;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
