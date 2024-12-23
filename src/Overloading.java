public class Overloading {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public double add(double a, double b) {
        return a + b;
    }
}
class main{
    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.add(1, 2));
        System.out.println(o.add(1, 2, 3));
        System.out.println(o.add(1, 2, 3, 4));
        System.out.println(o.add(1.02d, 1.02d));
    }
}
