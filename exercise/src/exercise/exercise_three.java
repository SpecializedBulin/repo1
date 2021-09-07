package exercise;

import java.util.Scanner;
public class exercise_three {
    public static void main(String[] args){
        Scanner scan1=new Scanner(System.in);
        int i=scan1.nextInt();
        int j=scan1.nextInt();
        int m,n;
        if(i>j){
            m=i;
            n=j;
        }
        else{
            m=j;
            n=i;
        }int r=m%n;
        while(r!=0){
            m=n;
            n=r;
            r=m%n;
        }
        System.out.println(n);
    }
}

