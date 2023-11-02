package practice.ait.arrays.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.ait.arrays.utils.ArrayTools;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
    }

    @Test
    void printArray() {
        System.out.println("=====TestPrintArray========");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void testSearch() {
        System.out.println("========testSearch========");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("Index = " + index);
        index = ArrayTools.search(arrStr, 6);
        System.out.println("Index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("Index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("Index = " + index);

    }

    @Test
    void testFindByPredicate() {
        System.out.println("========testFindByPredicate========");
        Integer num = ArrayTools.findByPredicate(arrNum, n-> n < 5);
        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n-> n % 5==0);
        System.out.println(num);
        String str=ArrayTools.findByPredicate(arrStr,s->s.length()==4);
        System.out.println(str);

    }
    @Test
    void testBubbleSort(){
        System.out.println("=======testBubbleSort=========");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);
        ArrayTools.printArray(arrStr);
    }
}