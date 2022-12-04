public class loop {
    public static void main(String[] args) {
        // 1. for loop
        System.out.println("for loop");

        // outer loop
        for (int i=1; i<=2; i++) {
            System.out.println("i="+i); // execute 2 times
            // inner loop
            for (int j=1; j<=3; j++) { // execute (i*j) 2*3=6 times
                System.out.println("j="+j);
            }
        }

        // 2. for each loop
        System.out.println("for each loop");

        String[] teachers = {"Mike", "John", "Jim", "Kelvin", "Kally"};
        for (String name: teachers) {
            System.out.println(name);
        }

        // 3. while loop
        System.out.println("while loop");

        int number = 0;
        while (number < 10) {
            System.out.println(number);
            number++;
        }

        // 4. do..while loop
        System.out.println("do..while loop");
        int i = 4;
        do {
            System.out.println(i);
            i++;
        } while (i<=8);

    }
}
