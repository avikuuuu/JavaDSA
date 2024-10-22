package pattern;

import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j==i){
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
