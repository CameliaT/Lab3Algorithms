/**
 * Created by camelia on 22/11/2016.
 */
public class InmultireNumar {
    public static void main(String[] args) {

        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());


        int max;
        int min;
        if (a < b){
            max=b;
            min=a;
        } else {
            max=a;
            min=b;
        }
        int product = 0;
        for (int i = 0; i < min; i++) {
            product = product + max;
            System.out.println(product);
        }
        System.out.println(a + "*" + b + "=" + product);
    }
}

