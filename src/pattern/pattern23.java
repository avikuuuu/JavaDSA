package pattern;

import java.util.Scanner;

public class pattern23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=5;
        int star=1;

        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(i==num/2+1){
                    System.out.print("*\t");
                } else if(i==num/2+1 || (i>=num/2+2-star && j <= num / 2 + star)){
                    System.out.print("*\t");
                }else{
                        System.out.print("\t");

                }
            }
            System.out.println();
            if(i<=num/2){
                star++;
            }else {
                star--;
            }
        }
    }
}
