public class Main {
    public static void main(String[] args) {
       Product coffee = new Product("Coffee", 2.5);
       Product tea = new Product("Tea", 1.5);
       Product cake = new Product("Cake", 3.5);
       Product sandwich = new Product("Sandwich", 4.5);

       Table table1 = new Table();
       table1.add(coffee);
       table1.add(tea);
       table1.add(cake);

       Table table2 = new Table();
       table2.add(coffee);
       table2.add(sandwich);

       Cafe cafe = new Cafe();
       cafe.add(table1);
       cafe.add(table2);

        System.out.println("Total income: " + cafe.getTotalIncome());
    }
}