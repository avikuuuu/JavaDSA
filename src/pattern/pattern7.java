package pattern;

import java.util.Scanner;

public class pattern7 {
    public static void TRIangle(int num){

        for(int i=0;i<num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(j+" ");

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
