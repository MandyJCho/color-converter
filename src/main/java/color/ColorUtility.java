package color;

import java.awt.Color;
import java.util.Arrays;

public class ColorUtility {

    private static Color hexToRgb(final String value) {
        try {
            int hex = Integer.parseInt(value.substring(1), 16);
            return new Color((hex & 0xFF0000) >> 16, (hex & 0xFF00) >> 8, (hex & 0xFF));
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            return null;
        }
    }

    // iterate to find closest matching via rgb difference then return name
    public static String convertToName(final String hex) {
        Color exteriorColor = hexToRgb(hex);
        if (exteriorColor == null) return "";

        VehicleColors colorMatch = Arrays.stream(VehicleColors.values())
                .filter(v -> v.getColorRange().inRange(exteriorColor))
                .findFirst()
                .orElse(null);

        return colorMatch != null ? colorMatch.name() : "";
    }
}
