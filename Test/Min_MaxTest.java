import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Min_MaxTest {

    static Min_Max test;
    @BeforeEach
    public void init(){
        test = new Min_Max();
    }

    @Nested
    public class minimumTest{
        @Test
        public void minimumEqualTwo(){
            int[] arr = {4,7,9,8,2,5};
            assertEquals(2,test.min(arr));
        }
        @Test
        public void minimumEqualNegativeFive(){
            int[] arr = {3, -1, 7, -5, 2, -4, 2, -1, -3};
            assertEquals(-5,test.min(arr));
        }
        @Test
        public void minimumEqualNegativeThree(){
            int[] arr = {0, 2, -2, 1, -1, 3, -3, 0, 0};
            assertEquals(-3,test.min(arr));
        }
        @Test
        public void minimumEqualNegativeHundred(){
            int [] arr ={1,-100,101};;
            assertEquals(-100,test.min(arr));
        }
    }
    @Nested
    public class maximumTest{
        @Test
        public void maximumEqualNine(){
            int[] arr = {4,7,9,8,2,5};
            assertEquals(9,test.max(arr));
        }
        @Test
        public void maximumEqualSeven(){
            int[] arr = {3, -1, 7, -5, 2, -4, 2, -1, -3};
            assertEquals(7,test.max(arr));
        }
        @Test
        public void maximumEqualTwo(){
            int[] arr = {0, 2, -2, 1, -1, 3, -3, 0, 0};
            assertEquals(3,test.max(arr));
        }
        @Test
        public void maximumEqualHundredAndOne(){
            int [] arr ={1,-100,101};;
            assertEquals(101,test.max(arr));
        }
    }
    @AfterAll
    public static void cleanup(){
        test = null;
    }
}