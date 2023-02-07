package lessons.lesson11.junit.fruitStorage;


class AppleGreenHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
