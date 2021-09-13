package sort;

import java.util.Scanner;
public class sort_three {
	public static void main(String args[]) {
		int a[] = new int[10];
		Scanner scan = new Scanner(System.in);
		int i,j;
		for(i=0;i<a.length;i++) {
			a[i] = scan.nextInt();
			quicksort(a,0,a.length-1);
		}
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}
	private static void quicksort(int a[],int left,int right) {
		if(left<right) {
			int mid = getmid(a,left,right);
			quicksort(a,left,mid-1);
			quicksort(a,mid+1,right);
		}
	}

    private static int getmid(int a[],int left,int right) {
	    int temp;
	    temp=a[left];
	    while(left<right) {
		    while(a[right]>=temp&&left<right) {	    	
			    right--;
		    }
		    a[left]=a[right];
		    while(a[left]<=temp&&left<right) {
			    left++;
		    }
		    a[right]=a[left];
	    }
	    a[left]=temp;
	    return left;
     }
}
