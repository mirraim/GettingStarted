/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing imports
 */
public class TestFQCN {

    // using FSQN - Fully Qualified Class Name
    public static void main(String[] args) {
        java.lang.String s = "We are testing ways to import classes";
        System.out.println(s);

        garden.vegetable.VineVegetable.main(args);
    }
}
