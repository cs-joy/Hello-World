// a primitive data type specifies the size and type of variable values, and it has no additional methods.
//  eight primitive data types in Java:
/**
 * byte   - 1 bytes {stores whole numbers from -128 to 127}
 * short  - 2 bytes {stores whole numbers from -32,768 to 32,767}
 * int    - 4 bytes {stores whole numbers from -2,147,483,648 to 2,147,483,647}
 * long   - 8 bytes {stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807}
 * float  - 4 bytes {stores fractional numbers. Sufficient for storing 6 to 7 decimal digits}
 * double - 8 bytes {stores fractional numbers. Sufficient for storing 15 decimal digits}
 * boolean -1 bit   {stores true or false values}
 * char    -1 bytes {stores a single character/letter or ASCII values}
 */
public class Primitive {
    public static void main(String[] args) {

        // 1. `byte` data types
        byte myNumber = 127; // range= -128 to 127
        System.out.println(myNumber);

        // 2. `short` data types
        short sNumber = 32341;// range= -32,768 to 32,767
        short s2Num = 1000;
        //short res = sNumber + s2Num; // we can't do that because of if we add two numbers then it exceed the limit of short range.
        System.out.println(sNumber + s2Num); // but here we can use it this way because after adding two numbers of short data type it's going to be an int data type and this values holds it as a int type that's why there have no error
       
        // 3. `int` data types
        int intNumber = 876542541; // range= -2,147,483,648 to 2,147,483,647
        System.out.println(intNumber);

        // 4. `long` data types
        // you should end the value with an "L"
        long longNumber = 9223372036854775807L; // range= -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        System.out.println(longNumber);

        // 5. `float` data types
        //  you should end the value with an "f"
        float floatNumber = 244.214f; // range= Sufficient for storing 6 to 7 decimal digits
        System.out.println(floatNumber);

        // 6. `double` data types
        // you should end the value with an "d"
        double doubleNum = 3144.243551276804251d; // range= Sufficient for storing 15 decimal digits
        System.out.println(doubleNum);

        // Scientific numbers
        // A floating point number can also be a scientific number with an "e" to indicate the power of 10
        float num1 = 234e4f;
        double num2 = 34E5d;
        System.out.println(num1 + "\n" + num2);

        // 7. `boolean` data types
        boolean javaIsFun = true;
        boolean javaIsHardToLearn = false;
        System.out.println(javaIsFun + "\n" + javaIsHardToLearn);

        // 8. `char` data types
        char grade = 'A'; // range= a single character/letter or ASCII values
        System.out.println(grade);

        // Alternatively, if you are familiar with ASCII values, you can use those to display certain characters
        char var1 = 122, var2 = 115; // source: https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html
        System.out.println(var1 + "" + var2);
    }

}
