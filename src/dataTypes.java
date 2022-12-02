public class dataTypes {
    public static void main(String[] args) {
        //System.out.print("Hello World");
        //System.out.println("Hello Wolrd");
        //System.out.print("Hello World");

        System.out.println("Hello World");

        int num = -5;
        System.out.println(num);

        long myLong  = 5;
        System.out.println(myLong);

        Double myDouble = 4.5;
        System.out.println(myDouble);

        float myFloat = (float)7.3; // allways need to do casting because fractional numbers are double in defualt
        System.out.println(myFloat);

        char myChar = '\u2122'; // unicode is important, s:: https://www.fileformat.info/info/unicode/char/00ae/index.htm
        System.out.println(myChar);

        // keep in mind, (int, float, double, long and char) are primitive data type in java

        String myString = "Rj Zahangir Alam"; // String is a class in java
        System.out.println(myString);

        boolean myBool = true; // either `true` or `false`
        System.out.println(myBool);

        // this is are basics data types in java and which of those we are using in this course
    }
}