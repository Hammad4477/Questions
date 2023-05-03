import java.util.Scanner;

public class Q2 {
    Scanner sc = new Scanner(System.in);
    String reverseWord(String s)
    {
        Integer count=0;
        char[] arr = new char[s.length()];
        for (int i = s.length()-1; i >=0; i--)
        {
            arr[count]= s.charAt(i);
            count++;
        }
        String str = new String(arr);
        return str;
    }

}
