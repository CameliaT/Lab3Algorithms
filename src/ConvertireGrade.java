/**
 * Created by camelia on 22/11/2016.
 */
public class ConvertireGrade {
    public static void main(String[] args) {

        int f = Integer.valueOf(ReadUtils.readValueFromConsole());

        double c = 5.0/9 * (f - 32);
        System.out.println (f + "in celsius" + c);

    }
   }

