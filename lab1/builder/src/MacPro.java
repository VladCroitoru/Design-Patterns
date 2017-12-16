import java.util.ArrayList;
import java.util.List;

public class MacPro {
    private List<String> parts = new ArrayList<>();
    private List<Double> prices = new ArrayList<>();

    public void addPart(String part) {

        parts.add(part);
    }

    public void addPrice(Double price) {

        prices.add(price);
    }

    public void showMacPro() {

        System.out.print("config info：");
        for (String part : parts) {
            System.out.print(part + " ");
        }

        System.out.print("\nprice:");
        Double total = 0d;

        for (Double price : prices) {

            total += price;
        }

        System.out.println(total);
    }
}
