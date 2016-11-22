/**
 * Created by camelia on 22/11/2016.
 */
public class TabelDeConversie {
    public static void main(String[] args) {

        int f = Integer.valueOf(ReadUtils.readValueFromConsole());

        double c = convertFToC(f);

        for (int i = 0; i < f; i++) {

            System.out.println("F" + i + "in c" + convertFToC(i));
        }
        System.out.println(f + "in celsius" + c);

    }
    public static double convertFToC(int f){
        return 5.0/9 * (f - 32);
    }
}
