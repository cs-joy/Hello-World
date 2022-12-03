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
    }
}
