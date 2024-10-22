package pattern;

import java.util.Scanner;

public class pattern18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(j<=num-i){
                    System.out.print("\t");
                }else {
                    System.out.print("*");
                    break;
                }
            }
            System.out.println();
        }
    }
}
