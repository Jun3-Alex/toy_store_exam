import java.util.Comparator;

public class ToyWeightComparator implements Comparator<Toy> {
    @Override
    public int compare(Toy a, Toy b) {
        return b.weight - a.weight;
    }
}
