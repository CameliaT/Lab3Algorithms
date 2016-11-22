import java.util.Scanner;

/**
 * Created by camelia on 22/11/2016.
 */
public class AlgoritmNegativ {

    public static void main (String[] args) {




        int number = Integer.valueOf(ReadUtils.readValueFromConsole());
        System.out.println("number: ");
        if(number<0){
            System.out.println("Negative");
        } else {
            int pow = number*number;
            System.out.println(pow);
        }
    }

  }