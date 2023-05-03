import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q13 {
    List<Integer> duplicates(Integer[] array)
    {
        Scanner sc = new Scanner(System.in);
        Integer count =0;
        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i]==array[j])
                {
                    abc.add(array[i]);
                    count++;
                }
            }
        }
        if(count==0)
        {
            abc.add(-1);
        }
        return abc;
    }
}
