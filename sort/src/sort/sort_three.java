package sort;

import java.util.Scanner;
public class sort_three {
	public static void main(String args[]) {
		int a[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int i;
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
		}
			quicksort(a,0,a.length-1);
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	private static void quicksort(int a[],int left,int right) {
		if(left>right) {
			return;
		}
		int i,j,temp,temp1;
		temp=a[left];
		i=left;
		j=right;
		while(i<j) {
			while(a[j]>=temp&&i<j) {
				j--;
			}
			while(a[i]<=temp&&i<j) {
				i++;
			}
			temp1=a[j];
			a[j]=a[i];
			a[i]=temp1;
		}
		a[left]=a[i];
		a[i]=temp;
		quicksort(a,left,i-1);
		quicksort(a,i+1,right);
	}
}

