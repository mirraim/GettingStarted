/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 2: Create an class in a package
 */

/**
 * 1) Запуск, если папка out уже есть: -cp out/production/GettingStarted garden/vegetable/VineVegetable
 * 2) Сборка: javac -d build src/garden/vegetable/VineVegetable.java
 * Опция -d нужна, чтобы VineVegetable.class оказался в отдельной папке сборки, а не в src
 */

package garden.vegetable;

public class VineVegetable {

    // Main Method simply outputs some data
    public static void main(String[] args) {
        System.out.println("I am a vegetable that grows on a vine.");
    }
}
