package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TaskTest {

//   class ArrayMethodsTest {
 //       ArrayMethods arrayMethods;

        @BeforeEach
        void setUp() {
  //          arrayMethods = new ArrayMethods();
        }

        @Test
        void testSumArray() {
            int[] arr = {1, 2, 3, 5, 5};
 //           assertEquals(16,arrayMethods.sumArray(arr));
        }

        @Test
        void testFindToElement() {
            int []arr = {1, 2, 3, 4, 5, 6};
            int i = 3; //искомый элемент
 //           assertEquals(2,arrayMethods.findToElement(arr,i));//2 - index of element
        }


}
