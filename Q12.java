import java.util.Scanner;

public class Q12 {
    Integer getPairsCount(Integer [] array , Integer k)
    {
        Scanner sc = new Scanner(System.in);
        Integer count=0;Integer sum=0;


        for (int i = 0; i < array.length; i++) {//{3,-1,4,5,3,-9,8,2}
            sum=array[i];
            for (int j = i+1; j <array.length ; j++) {
                if(sum + array[j]==k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}
