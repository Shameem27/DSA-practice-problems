import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;         
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));         }
        
        return result;
    }

    public static void main(String[] args) {
        int num1 = 100;
        BigInteger fact1 = factorial(num1);
        System.out.println("Factorial of "+ num1 + ":" + fact1);
	int num2 = 50;
        BigInteger fact2 = factorial(num2);
        System.out.println("Factorial of "+ num2 + ":" + fact2);

    }
}