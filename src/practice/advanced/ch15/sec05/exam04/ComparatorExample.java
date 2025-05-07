package practice.advanced.ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

        treeSet.add(new Fruit("banana", 3000));
        treeSet.add(new Fruit("apple", 4000));
        treeSet.add(new Fruit("grape", 1500));

        for (Fruit f : treeSet) {
            System.out.println(f.getName() + ":" + f.getPrice());
        }
    }
}
