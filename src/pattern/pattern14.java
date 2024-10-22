package pattern;

import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=0;j<num;j++){
                if(j<=num-i) {
                    System.out.print("*\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
