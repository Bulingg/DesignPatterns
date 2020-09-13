package strategy;

public class Cat{
    int height;
    int weight;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat anotherCat) {
        return Integer.compare(this.weight, anotherCat.weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "height=" + height +
                ", weight=" + weight +
                '}';
    }
}
