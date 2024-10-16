package pattern;

import java.util.Scanner;

public class pattern6 {
    public static void INVpramid(int num){

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j<=num-i) {
                    System.out.print("  ");
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//        int m=sc.nextInt();
        INVpramid(n);



    }
}
