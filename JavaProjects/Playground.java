public class Playground {
    int X = 5;
    public static void main(String[] args) {
        Playground playground1 = new Playground();
        Playground playground2 = new Playground();
        playground2.X = 9;
        System.out.println(playground1.X);
        System.out.println(playground2.X);
    }
}
