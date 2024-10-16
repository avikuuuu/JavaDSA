package pattern;

import java.util.Scanner;

public class pattern5 {

    public static void Hollow_square(int row,int col) {
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }



    public static void Hollow_square(int n) {
        for(int i=0;i<n;i++){

            if(i>0 && i<n-1) {
                for (int j=0;j<n;j++){
                    if(j==0 || j==n-1){
                        System.out.print("* ");
                    }else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }else{
                for(int j=0;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        Hollow_square(n);
        System.out.println();
        Hollow_square(n,m);


    }
}
