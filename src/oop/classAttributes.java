package oop;

public class classAttributes {
    int x = 6; // attribute
    int[] array = {3, 1, 7, 5, 9};
    final String[] OS = {"Kali", "Ubuntu", "Windows", "Mac"}; // didn't ability to override existing values
    double dPI = 3.1415;
    final float PI = (float) dPI;
    final int[] intVar = {3, 5, 1, 8, 0, 3, 7, 8, 2};

    public static void main(String[] args) {
        classAttributes myObj = new classAttributes();
        System.out.println("x= " + myObj.x); // access attribute

        for(int i=0; i<myObj.array.length; i++) {
            System.out.println(myObj.array[i]); // access attribute
        }

        // update attribute value function
        updateAttributeValue();

        // didn't ability to override existing values
        finalKeyword();

        // final with function
        myObj.finalFunction();
    }

    public static void updateAttributeValue() {
        System.out.println("Update Attribute value");
        classAttributes uObj = new classAttributes();
        uObj.array[2] = 0; // update attribute value

        for(int i=0; i<uObj.array.length; i++) {
            System.out.println(uObj.array[i]);
        }
    }

    public static void finalKeyword() {
        classAttributes finalAtt = new classAttributes();
        finalAtt.OS[1] = "Linux";
        //finalAtt.PI = 1; // didn't ability to override existing values

        for(int i=0; i<finalAtt.OS.length; i++) {
            System.out.println(finalAtt.OS[i]);
        }
        
        finalAtt.intVar[4] = 4;
        for(int i=0; i<finalAtt.intVar.length; i++) {
            System.out.println(finalAtt.intVar[i]);
        }

        final int value = finalAtt.x;
        System.out.println("value= " + value);
        //value = 9; // the final local varibale value cannot be assigned
    }

    public static final void finalFunction() {
        int x1 = 4;
        int x2 = 5;
        int result = x1 + x2;

        System.out.println("result= " + result);
    }
}
