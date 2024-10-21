package number;

import java.util.Scanner;

public class PrimeFactorization {

    public  static void prime(int num){
        int i=2;
        while(num >1){
            if(num%i==0){
                System.out.println(i);
                num /=i;
            }else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        prime(num);

    }
}
