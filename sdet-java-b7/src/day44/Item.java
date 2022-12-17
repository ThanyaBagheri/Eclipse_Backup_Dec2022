package day44;

public class Item {
    public int length;
    public int width;
    public int weigh;

    // it won't get inherited
    private String name;

    public void sell() {
        System.out.println("Item is sold");
    }

    public final void printSizeDetails() {
        System.out.println("length: " + length);
        System.out.println("width: " + width);
    }
}
