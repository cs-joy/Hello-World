//  variables are only accessible inside the region they are created. This is called scope.

public class scope {
    public static void main(String[] args) {
        // Code here CANNOT use x
        // System.out.println(x);

        int x = 100;

        // Code here can use x
        System.out.println(x);


        // A block of code refers to all of the code between curly braces {}
        scope();
    }

    static void scope() {
        // Code here CANNOT use x
        // System.out.println(x);

        int a = 5;

        if (a == 5) { // This is a block

            // Code here CANNOT use x
            // System.out.println(x);

            int x = 10;

            // Code here CAN use x
            System.out.println(x);

        } // The block ends here

        // Code here CANNOT use x
        // System.out.println(x);
    }
}
