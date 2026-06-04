package ex02;

import java.util.Scanner;

public class Program{
    static int sumNum(int num){
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if (num <= 1)
            return false;

        for (int i = 2; i * i <= num; i++) {
        
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int count = 0;
        Scanner scn = new Scanner(System.in);
        while(true){
            int num = scn.nextInt();
            if (num == 42)
                break;
            int sum = sumNum(num);
            if (isPrime(sum) == true)
                count++;
        }
        System.out.println("Count of coffee-request : " + count);
        scn.close();
    }
}