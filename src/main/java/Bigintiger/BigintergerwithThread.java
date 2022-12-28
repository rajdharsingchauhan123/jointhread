package Bigintiger;

import java.math.BigInteger;

public class BigintergerwithThread {
    public static void main(String args[]) throws Exception {
        // Initialize result
        BigInteger bigInteger = new BigInteger("1");
        int n=4;
        for (int i = 2; i <=n ; i++){
            //returns a BigInteger by computing ?this *val ? value.
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of 4 : "+bigInteger);
        //returns a Boolean value ?true? if and only if this BigInteger is prime
        BigInteger bigInteger2 = new BigInteger("197");
        System.out.println("IsProbablePrime method will return : "+ bigInteger2.isProbablePrime(2));
        //returns the next prime integer that is greater than this BigInteger.
        BigInteger nextPrimeNumber=bigInteger2.nextProbablePrime();
        System.out.println("Prime Number next to 197 : "+nextPrimeNumber);
        //returns the minimum between this BigInteger and val
        BigInteger min=bigInteger.min(bigInteger2);
        System.out.println("Min value : "+min);
        //returns the maximum between this BigInteger and val
        BigInteger max=bigInteger.max(bigInteger2);
        System.out.println("Maximum value : "+max);
    }
}
