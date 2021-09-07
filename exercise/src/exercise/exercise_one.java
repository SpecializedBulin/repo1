package exercise;

import java.util.Scanner;
public class exercise_one {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int i,j=0;
        int m = scan.nextInt();
        for(i=m;i<=m+100;i++){
            if((i%4==0&&i%100!=0)||i%400==0){
                j++;
                }
        }
        System.out.println(j+"\n");
    }

}
