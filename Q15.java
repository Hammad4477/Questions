import java.util.ArrayList;
import java.util.Scanner;

public class Q15 {
    Scanner sc = new Scanner(System.in);

    ArrayList<Integer> commonElements(Integer [] array, Integer [] array2, Integer [] array3)
    {

        Integer flag1=0,flag2=0;
        Integer val=0;Integer count=0;
        ArrayList<Integer>  duplicate = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            flag1=0;flag2=0;
            for (int j = 0; j < array2.length; j++) {
                if (array[i] == array2[j]) {
                    flag1 = 1;
                }
            }
            for (int k = 0; k <array3.length; k++) {
                if(array[i]==array3[k])
                {
                    flag2=1;
                }
            }
            if(flag1==1 && flag2==1)
            {
                duplicate.add(array[i]) ;
                count++;
                val++;
            }
        }
        if(count==0)
        {
            duplicate.add(-1);
        }
        return duplicate;
    }

}
