import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3 {
    Scanner sc = new Scanner(System.in);
    List<Integer> sortArrDescending(Integer[] array) {
        //sorting
        Integer temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            abc.add(array[i]);
        }
        return abc;
    }

    List<Integer> sortArrAscending(Integer[] array) {

        //sorting
        Integer temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println();
        List<Integer> abc = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            abc.add(array[i]);
        }
        return abc;
    }
}





