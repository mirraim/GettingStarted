/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing import static statements
 */

// a single-static-import declaration for static variable
import static java.lang.Math.PI;
// a single-static-import declaration for static method
import static java.lang.Math.sqrt;

/* a static-import-on-demand declaration for static method
import static java.lang.Math.*;
 */

public class TestImportStatic {

    public static void main(String[] args) {
        int radius = 2;

        double circumference = 2 * PI * radius;
        System.out.println("circumference = " + circumference);

        double sqrt81 = sqrt(81);
        System.out.println("sqrt81 = " + sqrt81);
    }
}
