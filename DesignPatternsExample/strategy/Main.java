package strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Add());
        System.out.println("Add: " + context.executeStrategy(3, 4));
        context.setStrategy(new Subtract());
        System.out.println("Subtract: " + context.executeStrategy(10, 5));
    }
}