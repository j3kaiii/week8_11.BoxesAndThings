
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author j3kaiii
 */
public class Box implements ToBeStored{
    
    private double maxWeight;
    private List<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored thing) {
        if (weight() + thing.weight() < maxWeight) {
            things.add(thing);
        }
    }
    
    public double weight() {
        double result = 0.0;
        for (ToBeStored thing : things) {
            result += thing.weight();
        }
        return result;
    }
    
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg";
    }
    
}
