package pattern;

import java.util.Scanner;

public class pattern9 {
    public static void butterfly(int num){

        for (int i = 1; i <= num; i++) {
            for(int j=1;j<=num*2;j++){
                if(j<=i || j>num*2-i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = num; 1 <= i; i--) {
            for(int j=num*2;1<=j;j--){
                if(j<=i || j>num*2-i){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        butterfly(n);



    }
}
