import java.math.BigInteger;

/**
 * Created by lenovo on 2016/10/18.
 */
public class Factorial {
    public static String result(int input){
        judge(input);
        BigInteger sum = new BigInteger("1");
        for (int i = input; i > 0; i--) {
            sum=sum.multiply(new BigInteger(String.valueOf(i)));
        }
        return sum.toString();
    }

    public static String subResult (int input, int start, int end){
        judge(input,start,end);
        String factorial = result(input);
        String subResultOfFactorial = factorial.substring(start-1,end);
        return subResultOfFactorial;
    }

    private static void judge(int input) {
        if (input<=0){
            System.out.println("非法输入");
            System.exit(0);
        }
    }

    private static void judge(int input, int start, int end) {
        judge(input);
        if (start<1||end<1||start>end){
            System.out.println("非法输入");
            System.exit(0);
        }
    }
}
