package chap03;

import java.util.Scanner;

public class ABSOper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=0;
        if((-100000 <= a) && (b <= 100000)){
        System.out.print("a = ");
        a = sc.nextInt(); //4
        System.out.print("b = ");
        b = sc.nextInt(); //5 
            
         System.out.println("a = "+a);
         System.out.println("b = "+b); 
         sc.close();
        }
    } 
}

