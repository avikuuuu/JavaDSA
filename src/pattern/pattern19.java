package pattern;

import java.util.Scanner;

public class pattern19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j==i || j==num-i+1){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");

                }
            }
            System.out.println();
        }
    }
}
