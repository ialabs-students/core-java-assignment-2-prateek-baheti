import java.math.BigInteger;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("plz enetr the length of array you want");
        int a=sc.nextInt();
        ArrayList<BigInteger> array = new ArrayList<BigInteger>();
        for (int i = 0; i < a; i++) {
            array.add(sc.nextBigInteger());
        }
        Collections.sort(array,Collections.reverseOrder());
        System.out.println(array);
        

    }
}