import java.util.Scanner;

public class Q14
{
    Integer partition(Integer[] arr, Integer low, Integer high) {
        Integer pivot = arr[high];
        Integer i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                Integer temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Integer temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    void quickSort(Integer[] arr, Integer low, Integer high) {
        if (low < high) {
            Integer partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }
}