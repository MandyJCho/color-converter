import color.ColorRange;
import color.ColorUtility;

public class Main {
    public static void main(String... args) {
        System.out.println("White #e9ece6 - " + ColorUtility.convertToName("#e9ece6"));
        System.out.println("Gray #5e5452 - " + ColorUtility.convertToName("#5e5452"));
        System.out.println("Black #010105 - " + ColorUtility.convertToName("#010105"));
        System.out.println("Red #c23928 - " + ColorUtility.convertToName("#c23928"));
        System.out.println("Orange #ff9900 - " + ColorUtility.convertToName("#ff9900"));
        System.out.println("Yellow #ffbd44 - " + ColorUtility.convertToName("#ffbd44"));
        System.out.println("Blue #34467b - " + ColorUtility.convertToName("#34467b"));
        System.out.println("Green #a7b9b3 - " + ColorUtility.convertToName("#a7b9b3"));
    }
}
