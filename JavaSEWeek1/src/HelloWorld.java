public class HelloWorld {


    public static void main(String[] args) {
        HelloWorld hw = new HelloWorld();
        //blackjack and temp exercises
        System.out.println(hw.blackjack(18, 15));
        System.out.println(hw.sumUnique(1, 1, 2));
        System.out.println(hw.checkTemp(true, 67));




    }



    public static int addTwoNums(int i, int j) {
        int a = i + j;
        return a;
    }

    public static int returnSumOnBool(int i, int j, boolean x) {
        if (i == 0 && j != 0) {
            return j;
        }
        if (j == 0 && i != 0) {
            return i;
        } else if (x = true) {
            return i + j;
        } else {
            return i * j;
        }
    }


    public int blackjack(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("No valid cards");
        }
        if ((21 - a) < (21 - b)) {
            return a;
        } else if ((21 - b) < (21 - a)) {
            return b;
        } else {
            return 0;
        }
    }

    public int sumUnique(int a, int b, int c) {
        int sum = a + b + c;
        if (a == b) {
            sum = sum - a - b;
        }
        if (a == c) {
            sum = sum - a - c;
        }
        if (b == c) {
            sum = sum - b - c;
        }
        if (a == b && a == c && b == c) {
            sum = 0;
        }
        return sum;
    }

    public boolean checkTemp(boolean x, int y) {
        boolean isSummer = x;
        int temperature = y;

        if (isSummer && temperature <= 100 && temperature >= 60) {
            return true;
        } else if ((!(isSummer)) && temperature <= 90 && temperature >= 60){
            return true;
        }
        else{
            return false;
        }
    }

    // Basic Exercise Testing
//        String s = "Hello World!";
//        System.out.println(s);
//        returnString("Hello there");
//        System.out.println(addTwoNums(3, 4));
//        System.out.println(returnSumOnBool(3, 5, false));
//        System.out.println("");
//        for (int i = 0; i < 20; i++) {
//            System.out.print(returnSumOnBool(i, 2, true) + " ");
//        }
//        System.out.println("");
//
//
//        int[] arrayOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] arrayOfInts2 = new int[10];
//
//        for (int x : arrayOfInts) {
//            System.out.print(x + " ");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            arrayOfInts2[i] = i;
//            System.out.print(arrayOfInts2[i] + " ");
//        }
//
//        for (int i = 0; i < arrayOfInts2.length; i++) {
//
//            System.out.print(returnSumOnBool(i, 2, true) + " ");
//        }
//
//        for (int i = 0; i < 10; i++) {
//            int x = arrayOfInts2[i] * 10;
//            System.out.println("");
//            System.out.print(x + " ");
//        }
}



