import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // learning about the ArrayList and alternative of the arrays.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(24);
        numbers.add(35);
        numbers.add(465);
        numbers.add(1, 71);
        System.out.println(numbers);
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(3));

        ArrayList<String> students = new ArrayList<>();
        students.add("Himanshu singh");
        students.add("Atul Patil");
        students.add("Ankit ");

        // Get a specific element from ararylist
        System.out.println(students.get(2));

        // add a specific element at specific pos
        students.add(2 , "yoyo");

        // if i wanted to update any specific value then
        students.set(2,"This is updated field");

        // similarly we have values for the remove part of operation.
        students.remove(2);
        students.remove("yoyo");
        System.out.println(students.get(2));

    }
}