package functions;

import java.util.Scanner;

public class factorial {

    public static void fact(int n ,int r) {
        int nFact=1;
        for(int i=1;i<=n;i++) nFact *=i;
        int nrFact=1;
        for(int i=1;i<=n-r;i++) nrFact *=i;
        int ans=nFact/nrFact;

        System.out.println(n+"P"+r+" = "+ans);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r= sc.nextInt();
        sc.close();
        fact(n,r);


    }
}
