package pattern;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int num=sc.nextInt();
        char ch='a';

        for(int i=1;i<=num;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}