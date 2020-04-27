public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String string = "";
        for(int a = 0; a < numberOfRows; a++){
            string =string +getRow(a);
            string = string + "\n";
        }
        return string;
    }

    public static String getRow(int numberOfStars) {
        String string ="";
        for(int a = 0; a < numberOfStars; a++){
            string =string + "*";
        }
        return string;
    }

    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}