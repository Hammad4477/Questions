import java.util.Scanner;

public class Q17 {
    Scanner sc = new Scanner(System.in);

    Integer firstNonRepeating(Integer [] array)
    {

        Integer count=0;
        Integer [] duplicateArray = new Integer [array.length];Integer flag=0;
        Integer val=0;
        label:
        for (int i = 0; i < array.length; i++) {//{1,2,3,4,3,2,1,5}
            count=array.length+1;//9
            for (int j = 0; j <array.length ; j++) {
                if(array[i] == array[j])
                {
                    count--;//4
                }
            }
            if(count==array.length)
            {
                val=array[i];
                flag=1;
                break label;
            }
        }
        if(flag==0)
        {
            val = -1;
        }
        return val;
    }

}
