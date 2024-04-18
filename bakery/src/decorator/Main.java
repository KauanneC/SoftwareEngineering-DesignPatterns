package decorator;

public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        order.addCake(new WithSaying(new VanillaCake(), "'PLAIN!'"));
        order.addCake(new WithSaying(new Sprinkles(new VanillaCake()), "'FANCY!"));
        order.addCake(new WithSaying(new WithSaying(new Sprinkles(new Sprinkles(new MultiLayred(new StrawberryCake()))), "'One of'"), "'EVERYTHING'"));

        // Print the order
        order.printOrder();
    }
}
	