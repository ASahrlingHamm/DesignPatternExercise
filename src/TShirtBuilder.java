public class TShirtBuilder {

    private TShirt tshirt = new TShirt();

    public TShirtBuilder() {

    }


    public TShirtBuilder addMaterial(String material){
        tshirt.setMaterial(material);
        return this;
    }

    public TShirtBuilder addSleeves(String sleeves){
        tshirt.setSleeves(sleeves);
        return this;
    }
    public TShirtBuilder addNeck(String neck){
        tshirt.setNeck(neck);
        return this;
    }

    public TShirt build() {

        return tshirt;
    }

}
