public class SkirtBuilder {

    private Skirt skirt = new Skirt();
    public SkirtBuilder() {

    }

    public SkirtBuilder addMaterial(String material) {
        skirt.setMaterial(material);
        return this;
    }

    public SkirtBuilder addWaistline(String waistline) {
        skirt.setWaistline(waistline);
        return this;
    }

    public SkirtBuilder addPattern(String pattern) {
        skirt.setPattern(pattern);
        return this;

    }

    public Skirt build() {

        return skirt;

    }



}
