public class Q21 {
    Integer factorial(int val)
    {
        if(val == 0 || val == 1) {
            return 1;
        }

        return val * factorial(val-1);
    }
}
