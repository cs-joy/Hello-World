public class arithmaticOperators {
    public static void main(String[] args){
        // Arithmatic Operators

        int num1 = 4;
        int num2 = 2;
        
        //1. addition operator
        int addtion = num1 + num2;
        System.out.println(addtion);

        // concatenate
        String fname = "Md. Zahangir ";
        String lname  = "Alam";
        String fullname = fname + lname;
        System.out.println(fullname);

        //2. subtraction operator
        int subtraction = num1 - num2;
        System.out.println(subtraction);


        //3. multiplication operator
        int multiplication = num1 * num2;
        System.out.println(multiplication);

        //4. division operator
        int division = num1 / num2;
        System.out.println(division);

        double answer = (double) 5 / 2; // casting needed 
        System.out.println(answer);

        //5. remainder operator
        int remainder = 4 % 2;
        System.out.println(remainder);

    }
}
