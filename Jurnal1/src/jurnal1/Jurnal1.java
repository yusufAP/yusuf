package jurnal1;

import java.util.Scanner;

public class Jurnal1 {

    public static void main(String[] args) {
        Scanner show=new Scanner(System.in);
        System.out.print("Input : ");
        int n=show.nextInt();
        long fibo[]=new long[n];
        
        fibo[0]=0;
        fibo[1]=1;
        
        for(int i=2;i<n;i++){
            fibo[i]=fibo[i-1]+fibo[i-2];
        }
        
        System.out.print("Output : ");
        
        for(int i=0;i<n;i++){
            System.out.print(fibo[i]+" ");
        }
    }
    
}
