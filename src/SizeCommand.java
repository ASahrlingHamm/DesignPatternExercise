public class SizeCommand implements MakeGarmentCommand{

    @Override
    public void finishGarment() {
        System.out.println("Garment has been cut to size." + "\n");
    }

}
