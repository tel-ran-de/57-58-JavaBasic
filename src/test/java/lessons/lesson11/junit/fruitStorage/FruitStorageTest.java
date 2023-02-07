package lessons.lesson11.junit.fruitStorage;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FruitStorageTest {

    private FruitStorage storage = new FruitStorage();
    private List<Apple> inventory = storage.getAllApples();

    @Test
    public void shouldFindGreenColorApples(){
        List<Apple> findGreen = storage.findApplesByColor(inventory, "green");
        for(Apple apple : findGreen){
            assertEquals("green", apple.getColor());
        }
    }
    @Test
    public void shouldFindRedColorApples() {
        List<Apple> findRed = storage.findApplesByColor(inventory, "red");
        for (Apple apple : findRed) {
            assertEquals("red", apple.getColor());
        }
    }
    @Test
    public void shouldFindYellowColorApples() {
        List<Apple> findYellow = storage.findApplesByColor(inventory, "yellow");
        for (Apple apple : findYellow) {
            assertEquals("yellow", apple.getColor());
        }
    }
    @Test
    public void shouldNotFindApples() {
        List<Apple> findColor = storage.findApplesByColor(inventory,"black");
        assertTrue(findColor.isEmpty());
    }
    @Test
    public void shouldFindGreenApplesByPredicate() {
        List<Apple> actual = storage.findApples(inventory, new AppleGreenColorPredicate());
        for (Apple apple :
                actual) {
            assertEquals("green", apple.getColor());
        }
    }
    @Test
    public void shouldFindRedApplesByPredicate() {
        List<Apple> actual = storage.findApples(inventory, new AppleRedColorPredicate());
        for (Apple apple :
                actual) {
            assertEquals("red", apple.getColor());
        }
    }
    @Test
    public void shouldFindHeavyApplesByPredicate() {
        List<Apple> actual = storage.findApples(inventory, new AppleHeavyWeightPredicate());
        for (Apple apple :
                actual) {
            assertTrue(apple.getWeight() > 150);
        }
    }
    @Test
    public void shouldFindLightApplesByPredicate() {
        List<Apple> actual = storage.findApples(inventory, new AppleLightWeightPredicate());
        for (Apple apple :
                actual) {
            assertTrue(apple.getWeight() < 150);
        }
    }
    @Test
    public void shouldFindHeavyGreenApplesByPredicate() {
        List<Apple> actual = storage.findApples(inventory,new AppleGreenHeavyPredicate());
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150 && apple.getColor().equals("green"));
        }
    }
    @Test
    public void shouldFindGreenApplesByAnonClass() {
        List<Apple> actual = storage.findApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "green".equals(apple.getColor());
            }
        });
        for (Apple apple:
                actual) {
            assertEquals("green", apple.getColor());
        }
    }
    @Test
    public void shouldFindRedApplesByAnonClass() {
        List<Apple> actual = storage.findApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });
        for (Apple apple:
                actual) {
            assertEquals("red", apple.getColor());
        }
    }
    @Test
    public void shouldFindHeavyApplesByAnonClass() {
        List<Apple> actual = storage.findApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        });
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150);
        }
    }
    @Test
    public void shouldFindLightApplesByAnonClass() {
        List<Apple> actual = storage.findApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() < 150;
            }
        });
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() < 150);
        }
    }
    @Test
    public void shouldFindGreenApplesLambda() {
        List<Apple> actual = storage.findApples(inventory, apple -> "green".equals(apple.getColor()));
        for (Apple apple:
                actual) {
            assertEquals("green", apple.getColor());
        }
    }
    @Test
    public void shouldFindRedApplesByLambda() {
        List<Apple> actual = storage.findApples(inventory, apple -> "red".equals(apple.getColor()));
        for (Apple apple:
                actual) {
            assertEquals("red", apple.getColor());
        }
    }

    @Test
    public void shouldFindHeavyApplesByLambda() {
        List<Apple> actual = storage.findApples(inventory, apple -> apple.getWeight() > 150);
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() > 150);
        }
    }

    @Test
    public void shouldFindLightApplesByLambda() {
        List<Apple> actual = storage.findApples(inventory, apple -> apple.getWeight() < 150);
        for (Apple apple:
                actual) {
            assertTrue(apple.getWeight() < 150);
        }
    }
}