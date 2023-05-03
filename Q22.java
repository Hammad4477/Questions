import java.util.Scanner;

public class Q22 {
    Integer[] calculateSpan(Integer [] array)
    {
        Scanner sc = new Scanner(System.in);
        Integer[] Lengtharray = new Integer[array.length];


        Integer pos=0;Integer count=1;
        for (int i = 0; i < array.length; i++) {
            pos = i;count=1;
            while(pos>0 && array[pos-1]<=array[i])
            {
                count++;
                pos--;
            }
            Lengtharray[i] = count;
        }
        return Lengtharray;
    }

}
