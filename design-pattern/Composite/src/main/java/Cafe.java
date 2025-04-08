import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private List<Table> tables = new ArrayList<>();

    public void add(Table table){
        tables.add(table);
    }

    public double getTotalIncome(){
        double total = 0;
        for (Table table : tables){
            total += table.getPrice();
        }
        return total;
    }
}
