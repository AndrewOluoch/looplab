public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String string ="";
        for (int a =1; a <= 5; a++){
            for(int b = 1; b <= 5; b++){
                string = string+ String.format("%3d |", b * a);
            }
            string = string +"\n";
        }

        return string;
    }

    public static String getLargeMultiplicationTable() {
        String string = "";
        for (int a = 1; a <= 10; a++){
            for (int b = 1; b <= 10; b++){
                string =string + String.format("%3d |", b*a);
            }
            string = string + "\n";
        }
        return string;
    }

    public static String getMultiplicationTable(int tableSize) {
        String string = "";
        for (int a = 1; a <= tableSize; a++){
            for(int b = 1; b<= tableSize; b++){
                string = string + String.format("%3d |",b*a);
            }
            string = string+ "\n";
        }
        return string;
    }
}