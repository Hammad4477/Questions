import java.util.Scanner;

public class Q9 {
    Scanner sc = new Scanner(System.in);
    void doUnion(Integer [] array , Integer[] array2)
    {
        Integer count=0,flag=0;
        for (int i = 0; i < array.length; i++)//1   2   3   4   5
        {
            for (int j = 0; j < array2.length; j++) //4 5   6
            {
                if(array[i]==array2[j])
                {
                    flag++;
                }
            }
            if(flag==0)
            {
                count++;
            }
            flag=0;
        }
        count+=array2.length;
        /*Integer distinct;
        Integer value = n-count;
        Integer value2 = m-value;
        distinct=value2+count;


        for (int i = 0; i < array2.length ; i++) {
            for (int j = i+1; j <array2.length ; j++) {
                if(array2[i]==array2[j])
                {
                    distinct--;
                }
            }

        }
*/
        System.out.println("the values in arrays are");
        for (int k = 0; k < array.length; k++) {
            System.out.print(" "+array[k]);
        }
        System.out.println();
        for (int k = 0; k < array2.length; k++) {
            System.out.print(" "+array2[k]);
        }
        System.out.println("\nthe count is "+count);
    }

}
