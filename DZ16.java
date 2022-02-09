package kype.nastya;


public class DZ16 {

    public static boolean isGreenLight = true;


    public static String speedCheck (int speedPlayer) {
        String result;

        if (isGreenLight == true) {
            result = "игрок проходит";
        } else {
            if (speedPlayer == 0) {
                result = "игрок проходит";
            } else {
                result = "игрок не проходит";
            }
        }
        return result;
    }
}
