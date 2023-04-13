import java.util.ArrayList;
import java.util.Arrays;

public class Steps {

    private ArrayList<String> steps = new ArrayList<String>();
    public Steps() {
    }

    public void addStep(String step){
        steps.add(step);
    }

    public String toString() {
        return Arrays.toString(steps.toArray());
    }
}
