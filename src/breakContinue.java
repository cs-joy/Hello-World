public class breakContinue {
    public static void main(String[] args) {
        System.out.println("break");

        // 1. break
        int myNum = 10;
        while (myNum <= 20) {
            System.out.println(myNum);
            myNum++;

            if (myNum == 15) {
                break;
            }
        }

        // 2. continue
        System.out.println("continue");
        int num = 10;
        
        for(int i=0; i<=num; i++) {
            if(i == 7) {
                continue;
            }
            System.out.println(i); // not printed 7
        
        }

        // in while
        
    }
}
