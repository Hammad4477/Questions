import java.util.Scanner;

public class Q23     {
    Integer rowWithMax1s()
    {
        Scanner sc = new Scanner(System.in);
        Integer n,m;Integer value;Integer count; Integer flag;
        System.out.println("enter the no of rows you want in your array");
        n = sc.nextInt();
        System.out.println("enter the no of cols you want in your array");
        m = sc.nextInt();
        Integer[][] array = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("enter value at index " + i+" "+j);//1 2 3 4
                value = sc.nextInt();//6
                flag=0;
                if(value==0 || value==1)
                {
                    flag++;
                }
                if(flag==0)
                {
                    System.out.println("the entered value is incorrect");
                    j--;
                }
                else{
                    array[i][j] = value;
                }
            }
        }
        Integer max=0;Integer row=0;
        for (int i = 0; i < n; i++) {
            count=0;
            for (int j = 0; j < m; j++) {
                if(array[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max)
            {
                row=i;
                max=count;
            }
        }
        return row;
    }

}
