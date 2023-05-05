import java.util.Scanner;

public class Q18 {
    Integer countSubArrayWithEqualZeroAndOne()
    {
        Scanner sc = new Scanner(System.in);
        Integer value;Integer count=0; Integer flag;
        System.out.println("enter the size of the array");
        Integer n = sc.nextInt();
        Integer [] array = new Integer [n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " + i);//1 2 3 4
            value = sc.nextInt();//6
            flag=0;
            if(value==0 || value==1)
            {
                flag++;
            }
            if(flag==0)
            {
                System.out.println("the entered value is incorrect");
                i--;
            }
            else{
                array[i] = value;
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            Integer sum = 0;
            for (int j = i; j < array.length ; j++)
            {
                sum+=array[j];
                if (sum == 0)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
