import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1 {
    Scanner sc = new Scanner(System.in);

    List<Integer> getMinMax()
    {

        Integer n=0,k=1;
        Integer max=0;
        Integer minn=0;
        Integer temp=0;
        while(k>0)
        {
            System.out.println("enter the no of values you want in your array");
            n = sc.nextInt();
            if(n==0)
            {
                System.out.println("invalid input. Please try again");
                k=1;
            }
            else {
                k=0;
            }
        }
        Integer [] array = new Integer [n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " +i);
            array[i]=sc.nextInt();
        }

        max = array[0];minn = array[0];
        for(int i=0; i< array.length;i++)
        {
            if(array[i]>max)
            {
                max = array[i];
            }
            if(minn>array[i])
            {
                minn=array[i];
            }
        }
        List<Integer> abc = new ArrayList<>();
        abc.add(max);
        abc.add(minn);
        return abc;
    }
}
