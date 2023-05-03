import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11 {
    List<Integer> MissingNumber()
    {
        Scanner sc = new Scanner(System.in);
        Integer n;Integer value;Integer count; Integer flag;
        System.out.println("enter the no of distinct values you want in your array");
        n = sc.nextInt();
        Integer [] array = new Integer [n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " + i);//1 2 3 4
            value = sc.nextInt();//6
            count=i-1;flag=0;
            while(count>=0)//2-0
            {
                if(value==array[count])
                {
                    flag++;
                }
                count--;
            }
            if(flag==0)
            {
                array[i] = value;
            }
            else{
                System.out.println("the value is not distinct. please re enter");
                i--;
            }
        }
        Integer minn = array[0];boolean check=false;Integer no=0;
        for(int i=0; i< array.length;i++)
        {
            if(minn>array[i])
            {
                minn=array[i];
            }
        }
        Integer range = minn + (n-1);
        List<Integer> abc = new ArrayList<>();
        while(minn<=range)
        {
            for (int i = 0; i < array.length; i++) {
                if(minn==array[i])
                {
                    check = true;
                }
            }
            if(check==false)
            {
                abc.add(minn);
                no++;
            }
            check=false;
            minn++;
        }
        if(no==0)
        {
            abc.add(-1);
        }
        return abc;
    }

}
