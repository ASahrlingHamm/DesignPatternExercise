public class TShirt {
        private int id;
        private String name;
        private String size;
        private String color;
        private String material;
        private String sleeves;
        private String neck;
        private double price = 25.0;

        public TShirt() {
        }

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSize() {
                return size;
        }

        public void setSize(String size) {
                this.size = size;
        }

        public String getColor() {
                return color;
        }

        public void setColor(String color) {
                this.color = color;
        }

        public String getMaterial() {
                return material;
        }

        public void setMaterial(String material) {
                this.material = material;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getSleeves() {
                return sleeves;
        }

        public void setSleeves(String sleeves) {
                this.sleeves = sleeves;
        }

        public String getNeck() {
                return neck;
        }

        public void setNeck(String neck) {
                this.neck = neck;
        }
}
