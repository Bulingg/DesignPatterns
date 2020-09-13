package strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] a = {6, 4, 9, 1, 5, 3, 8};
        Cat[] a = {new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
//        Dog[] a = {new Dog(2), new Dog(8), new Dog(4)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a, new CatHeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
