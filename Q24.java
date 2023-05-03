import java.util.Scanner;

public class Q24 {
    Integer trappingwater(Integer [] array)
    {
        Integer area,length;
        Integer val1 = array[0];
        Integer val2 = array[array.length-1];
        if(val1>val2)
        {
            length = val2;
        }
        else
        {
            length=val1;
        }
        area = length * (array.length-2);
        for (int i = 1; i < array.length-1; i++) {
            area-=array[i];
        }
        if(area>0)
        {
            return area;
        }
        else
        {
            return 0;
        }

    }


}
