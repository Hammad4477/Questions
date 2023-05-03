import java.util.Scanner;

public class Q16 {
    Scanner sc = new Scanner(System.in);

    Integer firstRepeated(Integer[] array)
    {
        Integer count=0;Integer val=0;
        label:
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if(array[i] == array[j])
                {
                    val= i+1;
                    count=1;
                    break label;
                }
            }
        }
        if(count==0)
        {
            val=-1;
        }
        return val;
    }

}
