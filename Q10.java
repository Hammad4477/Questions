import java.util.Scanner;

public class Q10 {
    void rotate()
    {
        Scanner sc = new Scanner(System.in);
        Integer n;
        System.out.println("enter the no of values you want in your array");
        n = sc.nextInt();
        Integer [] array = new Integer [n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("enter value at index " + i);
            array[i] = sc.nextInt();
        }
        Integer temp2=0;
        Integer temp=n-1;
        Integer last = array[temp];
        for (int i = array.length-1; i>0 ; i--) {//1 2 3 4 5
            if(i==array.length-1)
            {
                temp2 = array[0];//1
                array[0] = array[i];//5 2 3 4 5
            }
            else
            {
                if(i==1)
                {
                    array[i] = temp2;
                }
                array[temp] = array[i];
                temp--;
            }
        }
        System.out.println("the array after a cyclic rotation becomes");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" "+array[i]);
        }
    }

}
