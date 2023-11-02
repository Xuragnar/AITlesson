package practrice.wardrobe.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practrice.wardrobe.model.Wardrobe;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class WardrobeTest {
    private static final int SIZE = 10;
    private static final int MAX = 6;
    private static final int MIN = 1;
    Wardrobe[] wardrobes;
    static Random random = new Random();

    @BeforeEach
    void setUp() {
        wardrobes = new Wardrobe[SIZE];
        for (int i = 0; i < wardrobes.length; i++) {
            double height = random.nextInt(MIN, MAX);
            double width =  random.nextInt(MIN, MAX);
            double depth =  random.nextInt(MIN, MAX);

            wardrobes[i] = new Wardrobe(height, width, depth);
        }
    }

    private void printArray(Object[] arr, String title) {
        System.out.println("=======" + title + "=======");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    void testNaturalOrderWardrobe(){
        printArray(wardrobes,"Test Comparable before sort");
        Arrays.sort(wardrobes);
        printArray(wardrobes,"Test Comparable after sort");
        int index = Arrays.binarySearch(wardrobes, new Wardrobe(2,4,1));
        System.out.println("index = " + index);
    }
}