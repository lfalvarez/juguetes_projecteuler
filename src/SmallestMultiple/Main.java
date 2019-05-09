package SmallestMultiple;

public class Main {
    public static void main(String[] args){
        SmallestDividerFinder finder = new SmallestDividerFinder();
        int smallest = finder.findSmallestDividerFor(1, 20);
        System.out.println("El numero es "+ smallest);
    }
}
