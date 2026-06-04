package ex03;

import java.util.Scanner;

public class Program
{
    public static int getMin(int[] arr)
    {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int[] weeks = new int[18];

        while (true)
        {
            String week = scn.next();

            if (week.equals("42"))
                break;

            int weekNum = scn.nextInt();

            int[] grades = new int[5];

            for (int i = 0; i < 5; i++)
                grades[i] = scn.nextInt();

            int min = getMin(grades);

            weeks[weekNum - 1] = min;
        }

        for (int i = 0; i < 18; i++)
        {
            if (weeks[i] == 0)
                continue;

            System.out.print("Week " + (i + 1) + " ");

            for (int j = 0; j < weeks[i]; j++)
                System.out.print("=");

            System.out.println(">");
        }

        scn.close();
    }
}