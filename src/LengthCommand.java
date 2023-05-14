public class LengthCommand implements MakeGarmentCommand{

    @Override
    public void finishGarment() {
        System.out.println("Pants cut to desired length.");
    }
}
