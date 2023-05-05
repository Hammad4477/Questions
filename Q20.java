import java.util.Scanner;

public class Q20 {
    boolean subArrayExist(Integer[] array)
    {
        Scanner sc = new Scanner(System.in);

        Integer k;
        Integer count = 0;
        Integer sum = 0;
        k = 0;

        for (int i = 0; i < array.length; i++) {//{4,2,-3,1,6
            if (array[i] == k) {
                count++;
            }
            sum = array[i];
            for (int j = i+1; j < array.length; j++) {

                sum += array[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return false;
        } else
        {
            return true;
        }
    }

}
