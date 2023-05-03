import java.util.Scanner;

public class Q19 {
    Scanner sc = new Scanner(System.in);

    void rearrange(Integer[] array)
    {
        Integer count=0;int k=0;Integer temp;//{1,2,4,-1,2,4,-1,5,3,1,3}
        for (int i = 0; i < array.length; i++) {
            k=i;
            while(count%2==0 && k<array.length)
            {
                if(array[k]>=0)
                {
                    break;
                }
                else {
                    k++;
                    if(k>= array.length)
                    {
                        break;
                    }
                }
            }
            while(count%2!=0 && k<array.length)
            {
                if(array[k]<0)
                {
                    break;
                }
                else {
                    k++;
                    if(k>= array.length)
                    {
                        break;
                    }
                }
            }
            count++;
            for (int j = k; j >0; j--) {
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }

        for (int i = array.length-1; i >=0; i--) {
            System.out.print(array[i]+" ");
        }
    }

}
