/**
 * Created by camelia on 22/11/2016.
 */
public class AdaugareNumar {

    public static void main(String[] args) {

        int a = Integer.valueOf(ReadUtils.readValueFromConsole());
        int b = Integer.valueOf(ReadUtils.readValueFromConsole());


        int max;
        int min;
        if (a<b){
            max=b;
            min=a;
        } else {
            max=a;
            min=b;
        }
        int sum=max;
        for (int i = 0; i < min; i++) {
            sum = sum + 1;
        }
        System.out.println(a + "+" + b + "=" + sum);
    }
}
