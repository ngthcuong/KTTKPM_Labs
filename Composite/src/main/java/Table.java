import java.util.ArrayList;
import java.util.List;

public class Table implements Item{
    private List<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    @Override
    public double getPrice() {
       double total = 0;
         for (Item item : items){
              total += item.getPrice();
         }
       return total;
    }

}
