import  java.util.Scanner;
public class findDigit {

    public  static  int findDigit(int digit){
        int count=0;
        while (digit!=0){
            digit /=10;
            count++;
        }

return count;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int result=findDigit(num);
        System.out.println(result);

    }
}
