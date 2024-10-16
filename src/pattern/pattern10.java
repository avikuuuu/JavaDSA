package pattern;

import java.util.Scanner;

public class pattern10 {
    public static void Rombus(int num){

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num*2 ; j++) {
                if(j>=num-i || j>num*2-i){
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
        Rombus(n);



    }
}
