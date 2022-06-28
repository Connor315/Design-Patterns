

public class demo {
    // Main method
    public static void main(String[ ] args) {
        System.out.print(test.num);
        test.myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        test myObj = new test(); // Create an object of Main
        System.out.print(myObj.num1);
        myObj.myPublicMethod(); // Call the public method

        test1 ob = new test1();
        System.out.print(ob.num1);
    }
}
