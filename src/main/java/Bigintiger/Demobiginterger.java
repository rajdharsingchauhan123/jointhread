package Bigintiger;

import java.math.BigInteger;

public class Demobiginterger {
    public static void main(String[]  args){
// create  2BigInteger objects
        BigInteger big1= new BigInteger("8");
        BigInteger big2 =new BigInteger("4");

// createint object
        int  result;

//compare bigInteger big1 with big2
        result = big1.compareTo(big2);

        if(result == 0)
            System.out.println("Both values are equal");
        else if( result== 1)
            System.out.println("First value is greater");
        else if( result== -1)
            System.out.println("Second value is greater");

    }
}
