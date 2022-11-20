/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Testing imports
 */

// A single-class-import declaration
import garden.vegetable.VineVegetable;
//A type-import-on-demand declaration
import nursery.vegetable.*;


public class TestImport {
    public static void main(String[] args) {
        //java.lang package don't need the import
        String s = "We are testing ways to import classes";
        System.out.println(s);

        VineVegetable.main(args);
        nursery.vegetable.VineVegetable.main(args);
    }
}

//Такие классы не требуют импортов и могут конфликтовать с импортами из других пакетов
/*
class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}
*/