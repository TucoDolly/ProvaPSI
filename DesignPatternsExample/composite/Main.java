package composite;

public class Main {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite("Composite");
        composite.add(leaf1);
        composite.add(leaf2);

        composite.showDetails();
    }
}