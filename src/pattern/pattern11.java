package pattern;

import java.util.Scanner;

public class pattern11 {

    public static void HoloRombus(int num){
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num*2 ; j++) {
                if (i==1 || i==num){
                    if(j>num-i && j<=num*2-i) {
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                } else if(j==num-i+1 || j==num*2-i ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//        int m=sc.nextInt();
        HoloRombus(n);



    }
}
