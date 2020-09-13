package strategy;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.food, o2.food);
    }
}
