package ex01;

import java.util.Scanner;

public class Program{
    public static void isPrime(int num){
        if (num <= 1){
            System.err.println("IllegalArgument");
            System.exit(-1);
        }
        int count = 0;

        for (int i = 2; i * i <= num; i++) {
            count++;
        
            if (num % i == 0) {
                System.out.println("false " + count);
                return;
            }
        }
        count++;
        System.out.println("true " + count);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        isPrime(num);

        scn.close();
    }
}