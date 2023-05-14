import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        Customer customer = new Customer();
        CEO ceo = new CEO();
        BooleanMaker receiptMaker = new BooleanMaker();
        receiptMaker.addPropertyChangeListener(ceo);

        System.out.println("Please give your name.");
        customer.setName(scanner.nextLine());
        System.out.println("Please pick the type of garment you would like to create:");
        System.out.println("1: Skirt");
        System.out.println("2: Tshirt");
        System.out.println("3: Pants");
        System.out.println("Enter your choice:");
        menuChoice = scanner.nextInt();

        switch(menuChoice) {
            case 1:
                SkirtBuilder skirtBuilder = new SkirtBuilder();

                System.out.println("Pick size: M or L?");
                String size = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Pick material: cotton or lycra?");
                String material = scanner.nextLine();
                System.out.println("Pick waistline: S, M or L?");
                String waistline = scanner.nextLine();
                System.out.println("Pick pattern: checkered, striped or plain?");
                String pattern = scanner.nextLine();
                System.out.println("Pick color: black or white?");
                String color = scanner.nextLine();

                receiptMaker.setOrderMade(true);

                Skirt skirt = skirtBuilder
                        .addMaterial(material)
                        .addWaistline(waistline)
                        .addPattern(pattern)
                        .build();


                System.out.println("Skirt created: " + skirt.getMaterial() + " " +
                        skirt.getWaistline() + " " + skirt.getPattern());

                skirt.setColor(color);
                skirt.setSize(size);

                GarmentPipeline garmentPipeline = new GarmentPipeline();

                garmentPipeline.addCommand(new ColorCommand());
                garmentPipeline.addCommand(new SizeCommand());
                garmentPipeline.execute();

                receiptMaker.setGarmentDone(true);
                System.out.println("Receipt for skirt: " + customer.getName() + " " +  skirt.getSize() + " " + skirt.getColor()
                        + " " + skirt.getWaistline() + " " +  skirt.getPattern() + " " + skirt.getMaterial() + " " + skirt.getPrice());

                break;

            case 2:
                TShirtBuilder tShirtBuilder = new TShirtBuilder();

                System.out.println("Pick size: M or L?");
                size = scanner.nextLine();
                scanner.nextLine();
                System.out.println("Pick color: black or white?");
                color = scanner.nextLine();
                System.out.println("Pick material: cotton or linen?");
                material = scanner.nextLine();
                System.out.println("Pick sleeves: short, medium or long?");
                String sleeves = scanner.nextLine();
                System.out.println("Pick neck: turtle, round or v-neck?");
                String neck = scanner.nextLine();

                receiptMaker.setOrderMade(true);

                TShirt tshirt = tShirtBuilder
                        .addMaterial(material)
                        .addSleeves(sleeves)
                        .addNeck(neck)
                        .build();

                System.out.println("Tshirt created: " + tshirt.getMaterial() + " " + tshirt.getSleeves() + " " + tshirt.getNeck());

                tshirt.setColor(color);
                tshirt.setSize(size);

                garmentPipeline = new GarmentPipeline();

                garmentPipeline.addCommand(new ColorCommand());
                garmentPipeline.addCommand(new SizeCommand());
                garmentPipeline.execute();

                receiptMaker.setGarmentDone(true);
                System.out.println("Receipt for skirt: " + customer.getName() + " " +  tshirt.getSize() + " " + tshirt.getColor() +
                        " " + tshirt.getSleeves() + " " +  tshirt.getNeck() + " " + tshirt.getMaterial() + " " + tshirt.getPrice());

                break;

           case 3:
                PantsBuilder pantsBuilder = new PantsBuilder();


                System.out.println("Pick the size: M or L?");
                size = scanner.next();
                scanner.nextLine();
                System.out.println("Pick color: black or white?");
                color = scanner.nextLine();
                System.out.println("Pick material: cotton or lycra?");
                material = scanner.nextLine();
                System.out.println("Pick fit: slacks, sweatpants or tights?");
                String fit = scanner.nextLine();
                System.out.println("Pick length: 65, 66 or 68?");
                int length = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Pick the type: cargo, costume or casual?");
                String type = scanner.nextLine();

               receiptMaker.setOrderMade(true);

               Pants pants = pantsBuilder
                       .addType(type)
                       .addMaterial(material)
                       .addFit(fit)
                       .build();

               System.out.println("Pants created: " + pants.getMaterial() + pants.getFit() + pants.getType());

               pants.setColor(color);
               pants.setLength(length);
               pants.setSize(size);

               garmentPipeline = new GarmentPipeline();

               garmentPipeline.addCommand(new ColorCommand());
               garmentPipeline.addCommand(new LengthCommand());
               garmentPipeline.addCommand(new SizeCommand());
               garmentPipeline.execute();

               receiptMaker.setGarmentDone(true);
               System.out.println("Receipt for skirt: " + customer.getName() + " " +  pants.getSize() + " " + pants.getColor() + " "
                       + pants.getFit() + " " +  pants.getType() + " " + pants.getLength() + " " + pants.getPrice());


                break;

            default:
                System.out.println("Invalid input");

                break;



        }


    }
}