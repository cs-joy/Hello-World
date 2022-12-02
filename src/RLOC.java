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

    }
}
