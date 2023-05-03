import java.util.Scanner;

public class Q5 {
    Scanner sc = new Scanner(System.in);

    Integer findFrequency()
    {
        Integer n;
        System.out.println("enter the no of values you want in your array");
        n = sc.nextInt();
        Integer [] array = new Integer [n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " +i);
            array[i]=sc.nextInt();
        }
        System.out.println("enter which value's frequency you would like to find");
        Integer x;Integer count=0;
        x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==x)
            {
                count++;
            }
        }
        System.out.print("the frequency of "+x+" is ");
        return count;
    }
}
