public class Pants {
        private int id;
        private String name;
        private String type;
        private String size;
        private String color;
        private String material;
        private String fit;
        private int length;
        private double price = 30.0;

        public Pants() {
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

        public String getType() {
                return type;
        }

        public void setType(String type) {
                this.type = type;
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

        public String getFit() {
                return fit;
        }

        public void setFit(String fit) {
                this.fit = fit;
        }

        public int getLength() {
                return length;
        }

        public void setLength(int length) {
                this.length = length;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }
}
