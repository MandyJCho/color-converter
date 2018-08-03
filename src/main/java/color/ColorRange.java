package color;

import java.awt.Color;

public class ColorRange {
    final float hRange[];
    final float sRange[];
    final float bRange[];

    public ColorRange(float[] hRange, float[] sRange, float[] bRange) {
        this.hRange = hRange;
        this.sRange = sRange;
        this.bRange = bRange;
    }

    static ColorMetaBuilder builder() {
        return new ColorMetaBuilder();
    }

    static class ColorMetaBuilder {
        float hRange[] = {0f, 1f};
        float sRange[] = {.15f, 1f};
        float bRange[] = {.15f, 1f};

        public ColorMetaBuilder hRange(float min, float max) {
            hRange = new float[] { min, max };
            return this;
        }

        public ColorMetaBuilder sRange(float min, float max) {
            sRange = new float[] { min, max };
            return this;
        }

        public ColorMetaBuilder bRange(float min, float max) {
            bRange = new float[] { min, max };
            return this;
        }

        public ColorRange build() {
            return new ColorRange(hRange, sRange, bRange);
        }
    }

    private boolean between(float value, float[] range) {
        return value >= range[0] && value <= range[1];
    }

    public boolean inRange(Color color) {
        float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);

        float h = hsb[0];
        float s = hsb[1];
        float b = hsb[2];

        return between(h, hRange) && between(s, sRange) && between(b, bRange);
    }
}
