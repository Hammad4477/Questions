import java.util.Scanner;

public class Q12 {
    Integer getPairsCount(Integer [] array , Integer k)
    {
        Scanner sc = new Scanner(System.in);
        Integer count=0;Integer sum=0;


        for (int i = 0; i < array.length; i++) {
            sum=array[i];
            if(sum==k)
            {
                count++;
            }
            for (int j = i+1; j < array.length; j++) {
                sum=array[i];
                sum+=array[j];
                if(sum==k)
                {
                    count++;
                }
                for (int l = j+1; l < array.length; l++) {
                    if((sum+array[l]) == k)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
