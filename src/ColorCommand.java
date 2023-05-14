public class ColorCommand implements MakeGarmentCommand{

    @Override
    public void finishGarment() {
        System.out.println("The garment has been dyed.");
    }
}
