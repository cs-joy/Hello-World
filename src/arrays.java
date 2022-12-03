public class arrays {
    public static void main(String[] args) {
        // declare an array
        String[] friends = {"Kally", "Jim", "Kaven", "Doe", "John"};

        System.out.println(friends[1]);

        // find length of the array
        int len = friends.length;
        System.out.println(len);

        // print our whole array
        for(int i=0; i<len; i++) {
            System.out.println(friends[i]);
        }
    }
}
