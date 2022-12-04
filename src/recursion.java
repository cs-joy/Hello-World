public class recursion {
    // Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down
    // into simple problems which are easier to solve.
    public static void main(String[] args) {
        System.out.println("Recursion");
        int result = sum(10);
        System.out.println("sum of 10= " + result);
    }

    public static int sum (int num) {
        if(num > 0) {
            return(num+sum(num - 1));
        } else {
            return 0;
        }
        
    }
}
