public class NestedClasses {
    // 1.
    static String s;

    static class Inner {
        void testMethod(){
            s = "Set from Inner";
        }
    }

    // 2.
    // a. Box.Filler
    // b. Box.AccessibleBox
    // c. AccessibleAWTContainer
    // d. Filler
    // e. call the constructor with the right parameters

    // Exercises
    // 1.
    // InnerClass1: getString invoked.
    // InnerClass1: getAnotherString invoked.

    // 2.
    //
}
