import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        ToyQueue toyQueue = new ToyQueue();
        toyQueue.put("1", "Мяч", 10);
        toyQueue.put("2", "Машинка", 20);
        toyQueue.put("3", "Кукла", 30);

        List<String> selectedToys = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            selectedToys.add(toyQueue.get());
        }

        String filename = "selectedToys.txt";
        ToyFileWriter.writeToFile(selectedToys, filename);



    }
}
