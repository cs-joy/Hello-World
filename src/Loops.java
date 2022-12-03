public class Loops {
    public static void main(String[] args) {
        System.out.println("Loops Explanation");
        System.out.println("__________________");

        // for loop
        for (int i = 0; i<10; i++) {
            System.out.println("Hello " + i);
        }

        // while loop
        int a = 5;
        int b = 4;
        int c = 2;
        while (a < 10) {
            System.out.println("infinity loop!");
            a++;
        }

        // with `break` keyword
        while(b < 10) {
            System.out.println("break");
            break;
        }

        // with `continue` keyword
        while(c < 10) {
            c++;
            if (c == 8) {
                continue;
            }

            System.out.println("Hello");
        }

    }
}
