package OOPS.Generics;

public class Main {
    public static void main(String[] args) {
        GenericArrayList<Integer> list = new GenericArrayList<>();
        list.add(2);
        list.add(34);
        System.out.println(list);
        System.out.println(list.getSize());

        // lets test this for string
        GenericArrayList<String> list2 = new GenericArrayList<>();
        list2.add("Himanshu");
        list2.add("Singh");
        System.out.println(list2);
        System.out.println(list2.getSize());
    }
}
