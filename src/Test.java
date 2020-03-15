public class Test {
    public static void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is: " + age);
    }

    public static void main(String[] args) {
        Test.pupAge();

        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println(result);

        int x = 10;

        while (x < 20) {
            System.out.println("value of x :" + x);
            x++;
        }

        for (x = 20; x < 30; x = x + 1) {
            System.out.println("x = " + x);
        }
        System.out.println("----");
        do {
            System.out.println("x = " + x);
            x++;
            System.out.println("x = " + x);
        }while (x < 30);

        int[] number = {10, 20, 30, 40, 50};
        for (int item : number) {
            System.out.println("item = " + item);
        }

        char grade = 'C';

        switch(grade) {
            case 'A' :
                System.out.println("Excellent!");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            case 'D' :
                System.out.println("You passed");
            case 'F' :
                System.out.println("Better try again");
                break;
            default :
                System.out.println("Invalid grade");
        }

        Integer y = 5; // boxes int to an Integer object
        Integer s = 4;  // boxes int to an Integer object
        y =  y + 10;   // unboxes the Integer to a int then boxes int to an Integer object
        y =  y + s;     // unboxes the Integer to a int then boxes int to an Integer object
        int z = y + 10;  // unboxes the Integer to a int
        System.out.println("x = " + y);
        System.out.println("z = " + z);

        Double c = Double.valueOf(5);
        Float a = Float.valueOf("80");
        Integer b = Integer.valueOf("1010",8);

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        Integer q = 5;

        System.out.println(q.toString());
        System.out.println(Integer.toString(12));

        int x1 = Integer.parseInt("9");
        double c1 = Double.parseDouble("5");
        int b1 = Integer.parseInt("444",16);
        System.out.println(x1);
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);


        String s1 = new String("5");
        String s2 =  new String("5");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println(s1.equals(s2));  // 值
        System.out.println(s1 == s2);   // 地址
        System.out.println(s1.contentEquals(s2));


//        Character ch1 = new Character('a');
//        Character ch2 = 'a';
//        System.out.println("ch1 = " + ch1);
//        System.out.println("ch2 = " + ch2);
//        System.out.println(ch1 == ch2);
//        System.out.println(ch1.equals(ch2));



    }

}
