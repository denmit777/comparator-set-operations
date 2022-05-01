package homework9.task2;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {

        HashSet set1 = new HashSet();
        set1.add(3);
        set1.add("a");
        set1.add(1);
        set1.add("b");

        HashSet set2 = new HashSet();
        set2.add(1);
        set2.add("b");
        set2.add(4);

        System.out.println(SetOperation.union(set1, set2)); //[a, 1, b, 3, 4]
        System.out.println(SetOperation.intersection(set1, set2)); //[1, b]
        System.out.println(SetOperation.minus(set1, set2)); //[a, 3]
        System.out.println(SetOperation.minus(set2, set1)); //[4]
        System.out.println(SetOperation.difference(set1, set2)); //[a, 3, 4]
    }
}
