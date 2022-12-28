package Bigintiger;

import java.math.BigInteger;

public class Bigintegeradddemo {
    public static void main(String[] args) {
        BigInteger big1,big2 ,big3 ,big4;
        big1 =new BigInteger("10000000000000");
        big2 =new BigInteger("1");
        big3 =big1.add(big2);
        big4 = BigInteger.valueOf(big1.compareTo(big2));
        System.out.println(big4);
        System.out.println(big3);
    }
}
