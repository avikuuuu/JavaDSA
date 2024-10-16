package pattern;

import java.util.Scanner;

public class pattern8 {
    public static void TRIangle(int num){

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i ; j++) {
                if((i+j)%2 == 0 ){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
//        int m=sc.nextInt();
        TRIangle(n);



    }
}
