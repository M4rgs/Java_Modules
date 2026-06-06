import java.util.Scanner;

public class Program{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        String tex = scn.nextLine();

        int[] arr = new int[65536];
        for (int i = 0; i < tex.length(); i++){
            char c = tex.charAt(i);
            arr[c]++;
        }

        char[] topChar = new char[10];
        int[] topFreq = new int[10];

        for (int c = 0; c < 65536; c++)
        {
            if (arr[c] == 0)
                continue;
            int pos = -1;
            for (int i = 0; i < 10; i++){
                if (arr[c] > topFreq[i] ||(arr[c] == topFreq[i] && topFreq[i] != 0 && c < topChar[i]))
                {
                    pos = i;
                    break;
                }
            }
            if (pos == -1)
                continue;
            for (int i = 9; i > pos; i--)
            {
                topFreq[i] = topFreq[i - 1];
                topChar[i] = topChar[i - 1];
            }

            topFreq[pos] = arr[c];
            topChar[pos] = (char)c;
        }

        int maxFreq = 0;
        for (int i = 0; i < 10; i++)
        {
            if (topFreq[i] > maxFreq)
                maxFreq = topFreq[i];
        }

        int[] height = new int[10];
        for (int i = 0; i < 10; i++)
        {
            if (topFreq[i] == 0)
                continue;
            height[i] = topFreq[i] * 10 / maxFreq;
        }

        for (int row = 10; row >= 0; row--)
        {
            for (int col = 0; col < 10; col++)
            {
                if (height[col] == row)
                    System.out.printf("%-5d", topFreq[col]);
                else if (height[col] > row)
                    System.out.printf("%-5s", "#");
                else
                    System.out.printf("%-5s", "");
            }
            System.out.println();
        }
        for (int i = 0; i < 10; i++)
        {
            if (topFreq[i] > 0)
                System.out.printf("%-5c", topChar[i]);
        }
        System.out.println();
        scn.close();
    }
}

