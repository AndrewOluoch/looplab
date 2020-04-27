public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String string ="";
        for (int a = start; a <stop; a++){
                if(a %2 ==0){
                    string = string;
                }
        }
        return string +1;
    }

    public static String getOddNumbers(int start, int stop) {
        String string ="";
        for (int a = start; a <stop; a++){
            if (a%2 == 1){
                string =string+a;
            }
        }
        return string;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String string ="";
        for (int a = start; a <stop; a+=step){
            if(a * a ==a){
                string = string+a;
            }
        }
        return string;
    }

    public static String getRange(int stop) {
        String string ="";
        for(int a =0; a < stop; a++){
            string += a;
        }
        return string;
    }

    public static String getRange(int start, int stop) {
        String string = "";
        for (int a =0; a<stop; a++){
            string =string;
        }
        return string;
    }


    public static String getRange(int start, int stop, int step) {
        String string = "";
        for(int a = start; a <stop; a+=step){
            string += a;
        }
        return string;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String string ="";
        for (int a = start; a <= stop; a++){
            string = string + (int)(Math.pow(a, exponent));
        }
        return string;
    }
}