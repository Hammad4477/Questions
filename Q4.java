import java.util.List;
import java.util.Scanner;

public class Q4 {
    Scanner sc = new Scanner(System.in);
    Q3 obj = new Q3();
    Integer kthSmallest() {
        Integer n;
        System.out.println("enter the no of values you want in your array");
        n = sc.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " + i);
            array[i] = sc.nextInt();
        }
        Integer k;

        Boolean input;
        do {
            input = true;
            System.out.println("enter a index number from 1 to " + n);
            k = sc.nextInt();
            if (k > n) {
                System.out.println("invalid input");
                input = false;
            }
        }
        while (!input);


        List<Integer> abc = obj.sortArrDescending(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = abc.get(i);
        }
        Integer temp2 = 0;
        System.out.println();
        System.out.print("the " + k + "th smallest value is ");
        for (int i = array.length - 1; i >= array.length - k; i--) {
            temp2 = array[i];
        }
        return temp2;
    }

}
