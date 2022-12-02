public class RLOC {
    // RLOC - Relational & Logical Operators - Conditionas
    public static void main(String[] args) {
        int a = 4;

        a = a + 2; // a += 2;
        a++; // increment // a += 1; // a = a + 1;
        System.out.println(a); // 7

        a = a - 2; // a -= 2;
        a--; // decrement // a = a-1; // a -= 1;
        System.out.println(a); // 4

        a = a * 2; // a *= 2;
        System.out.println(a); // 8

        a = a / 2; // a /= 2;
        System.out.println(a); // 4


        // main topic
        // comparison operators
        int n1 = 5;
        int n2 = 3;

        // greater than operator
        boolean answer = n1 > n2;
        System.out.println(answer);

        // less than operator
        boolean result = n1 < n2;
        System.out.println(result);

        // equality/ equal operator
        boolean ans= n1 == n2;
        System.out.println(ans);

        // greater than equal operator
        boolean isTrue = n1 >= n2;
        System.out.println(isTrue);

        // less than equal operator
        boolean res = n1 <= n2;
        System.out.println(res);

        // not equal to be operator
        boolean isNotEqual = n1 != n2;
        System.out.println(isNotEqual);


        // logical operators
        // or operator
        boolean or= n1 == 5 || n2 == 2; // need to any of one true
        System.out.println(or);

        // and operator
        boolean and= n1 == 5 && n2 == 2; // need to both of them are true
        System.out.println(and);


        // conditional statements
        // if statement
        if(n1>3) {
            System.out.println("number is greater than 3");
        }
        System.out.println("Continue...");

        // if..else statement
        if(n2>3) {
            System.out.println("number is greater than 3");
        } else {
            System.out.println("number is less than 3");
        }
        System.out.println("Continue...");

        // second way to demonstrate with boolean
        boolean is_true = n1 > 3;
        // is_true == true
        // is_true
        // both meaning are same
        if(!is_true) {
            System.out.println("number is greater than 3");
        } else {
            System.out.println("number is less than 3");
        }

        // if... else if .. else statement
        if (n1 > 0) {
            System.out.println("n1 is Positive");
        } else if (n1 < 0) {
            System.out.println("n1 is Negative");
        } else {
            System.out.println("n1 is Zero");
        }

        // switch statement
        switch(n1) {
            case 1:
                System.out.println("n1 is 1");

            case 2:
                System.out.println("n1 is 2");

            case 3:
                System.out.println("n1 is 3");

            case 4:
                System.out.println("n1 is 4");

            case 5:
                System.out.println("n1 is 5");
                break;

            default:
                System.out.println("n1 is not one, two, three, four or five");
                break;
        }

    }
}
