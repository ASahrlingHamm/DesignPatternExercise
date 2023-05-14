public class PantsBuilder {

    private Pants pants = new Pants();

    public PantsBuilder() {

    }

    public PantsBuilder addType(String type) {
        pants.setType(type);
        return this;
    }

    public PantsBuilder addMaterial(String material) {
        pants.setMaterial(material);
        return this;
    }
    public PantsBuilder addFit(String fit) {
        pants.setFit(fit);
        return this;
    }

    public Pants build() {

        return pants;
    }

}

