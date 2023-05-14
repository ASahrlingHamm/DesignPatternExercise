import java.util.ArrayList;

public class GarmentPipeline {

    private ArrayList<MakeGarmentCommand> pipeline = new ArrayList<>();

    public void addCommand(MakeGarmentCommand command) {pipeline.add(command);}


    public void execute() {

        for(MakeGarmentCommand command: pipeline){
            System.out.println("---");
            command.finishGarment();
        }

    }



}
