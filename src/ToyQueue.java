import java.util.PriorityQueue;
import java.util.concurrent.ThreadLocalRandom;

public class ToyQueue implements ToyQueueInterface {
    private PriorityQueue<Toy> queue;
    private int totalWeight;

    public ToyQueue() {
        this.queue = new PriorityQueue<>(new ToyWeightComparator());
        this.totalWeight = 0;
    }

    @Override
    public void put(String id, String name, int weight) {
        Toy toy = new Toy(id, name, weight);
        this.queue.add(toy);
        this.totalWeight += weight;
    }

    @Override
    public String get() {
        int randomWeight = ThreadLocalRandom.current().nextInt(totalWeight) + 1;
        int cumulativeWeight = 0;
        for (Toy toy : queue) {
            cumulativeWeight += toy.weight;
            if (cumulativeWeight >= randomWeight) {
                return "Игрушка: ID = " + toy.id + ", Название = " + toy.name;
            }
        }
        return "Игрушка не найдена";
    }
}
