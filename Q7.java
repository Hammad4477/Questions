import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q7 {
    Scanner sc = new Scanner(System.in);

    List<Integer> subArraySum(Integer[] array, Integer s)
    {
        Integer temp=0;Integer flag = 0;
        List<Integer> abc = new ArrayList<>();

        brea:
        for (int i = 0; i < array.length; i++) {
            temp=array[i];
            for (int j = i+1; j < array.length; j++) {
                temp+=array[j];
                if(temp==s)
                {
                    abc.add(i+1);
                    abc.add(j+1)
;                    flag=1;
                    break brea;
                }
            }

        }
        if(flag==0)
        {
            abc.add(-1);
        }
        return abc;
    }
}
