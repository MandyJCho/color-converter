package color;

import lombok.Getter;

@Getter
public enum VehicleColors {
    RED_0_HUE(ColorRange.builder().hRange(0, 15/360f).build()),
    ORANGE(ColorRange.builder().hRange(15/360f, 38/360f).build()),
    YELLOW(ColorRange.builder().hRange(38/360f, 60/360f).build()),
    GREEN(ColorRange.builder().hRange(60/360f, 165/360f).sRange(.09f, 1).build()),
    BLUE(ColorRange.builder().hRange(165/360f, 265/360f).build()),
    PURPLE(ColorRange.builder().hRange(265/360f, 330/360f).build()),
    RED_360_HUE(ColorRange.builder().hRange(330/360f, 1).build()),
    BLACK(ColorRange.builder().sRange(0, 1).bRange(0, .15f).build()),
    WHITE(ColorRange.builder().sRange(0, .25f).bRange(.88f, 1).build()),
    GRAY(ColorRange.builder().sRange(0, .15f).bRange(.15f, .88f).build());

    private ColorRange colorRange;

    VehicleColors(ColorRange colorRange) {
        this.colorRange = colorRange;
    }
}
