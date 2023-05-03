import java.util.List;
import java.util.Scanner;

public class Q6 {
    Scanner sc = new Scanner(System.in);
    Q3 obj = new Q3();

    void sort012()
    {
        Integer n;
        System.out.println("enter the no of values you want in your array");
        n = sc.nextInt();
        Integer [] array = new Integer [n];Boolean flag=false;
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " +i);
            array[i]=sc.nextInt();
            if(array[i] !=0 && array[i] !=1 && array[i] !=2 )
            {
                flag=false;
            }
            while(!flag)
            {
                System.out.println("Invalid input. Please enter value at index "+i+" again");
                array[i]=sc.nextInt();
                if(array[i]==0 || array[i] ==1 || array[i] ==2 )
                {
                    flag=true;
                }
            }



        }
        List<Integer> abc = obj.sortArrDescending(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = abc.get(i);
        }

        System.out.println("Sorted array in ascending order");
        for (int i = array.length-1; i >=0; i--) {
            System.out.print("  "+array[i]);
        }

    }

}
