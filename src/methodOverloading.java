public class methodOverloading {
    public static void main(String[] args) {
        // int method
        System.out.println(addition(3, 4));
        System.out.println(addition(3.5, 4));
        System.out.println(addition(3.7, 4.1));
        System.out.println(addition(3, 4.16));
    }

    static int addition(int a, int b) {
        return(a+b);
    }

    static float addition(float x, float y) {
        return(x+y);
    }

    static double addition(double x1, double x2) {
        return(x1+x2);
    }
}
