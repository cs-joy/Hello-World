import java.security.Principal;

public class arrays {
    public static void main(String[] args) {
        // declare an array
        String[] friends = {"Kally", "Jim", "Kaven", "Doe", "John"};

        // access the element
        System.out.println(friends[1]);

        // find length of the array
        int len = friends.length;
        System.out.println(len);

        // print our whole array
        for(int i=0; i<len; i++) {
            System.out.println(friends[i]);
        }

        // update/change an array element
        friends[3] = "Mike";
        System.out.println(friends[3]);


        // int
        int[] numbers = {2, 5, 3, 4, 9, 6, 1};
        // access
        System.out.println(numbers[4]);

        // print out all the elements of the array
        for(int i =0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("for-each\n");
        // using for-each loop to print out all the element of an array
        for(String i:friends) {
            System.out.println(i);
        }

        for(int i: numbers) {
            System.out.println(i);
        }


        // Multidimensional array
        System.out.println("Multidimensional array");

        // for int type
        int[][] randomNumber = {
            {3, 7, 4},
            {1, 8, 2},
            {5, 0, 9}
        };

        // access elment of the array
        System.out.println(randomNumber[1][1]); // prints out: 8

        // update/change element value of the array
        randomNumber[2][1] = 6;
        System.out.println(randomNumber[2][1]);

        System.out.println("for loop");
        // for loop
        for(int i=0; i<randomNumber.length; i++) {
            for(int j = 0; j<randomNumber.length; j++) {
                System.out.println(randomNumber[i][j]);
            }
        }

        System.out.println("another way , for loop");
        // sec way for loop prints all result
        for(int i=0; i<randomNumber.length; i++) {
            for(int j = 0; j<randomNumber[i].length; j++) {
                System.out.println(randomNumber[i][j]);
            }
        }
    }
}
