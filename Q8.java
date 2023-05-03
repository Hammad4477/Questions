import java.util.Scanner;

public class Q8 {
    void segregateElements()
    {
        Scanner sc = new Scanner(System.in);
        Integer n;Integer temp;Integer counterpos=0;Integer counterneg=0;Integer posArrayLength =0;Integer negArrayLength=0;
        System.out.println("enter the no of values you want in your array");
        n = sc.nextInt();
        Integer [] array = new Integer [n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " + i+" (enter at least 1 negative value");
            array[i] = sc.nextInt();
            if(array[i]>=0)
            {
                posArrayLength++;
            }
        }
        negArrayLength = n - posArrayLength;

        Integer [] posarray = new Integer [posArrayLength];
        Integer [] negarray = new Integer [negArrayLength];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0)
            {
                posarray[counterpos] = array[i];
                counterpos++;
            }
            else
            {
                negarray[counterneg] = array[i];
                counterneg++;
            }

        }
        int j = 0;
        for(int i =0;i<array.length;i++)
        {
            while(i<posArrayLength)
            {
                array[i]=posarray[i];
                i++;
            }
            array[i] = negarray[j];
            j++;
        }
        for (int k = 0; k < array.length; k++) {
            System.out.print(" "+array[k]);
        }
        System.out.println("");
    }
}
