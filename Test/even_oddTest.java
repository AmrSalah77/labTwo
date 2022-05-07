import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
class even_oddTest {
    static even_odd test;
    @BeforeEach
    public void init(){
        test = new even_odd();
    }
    //Even equals 2
    @Nested
    public class evenTest{
        @Test
        void Two_ExpectedEven() {
            assertEquals(2,test.checkEven_or_odd(2));
        }
        @Test
        void fourThousandSixHundredFortyEight_ExpectedEven() {
            assertEquals(2,test.checkEven_or_odd(4648));
        }
        @Test
        void fiveHundredFortySix_ExpectedEven() {
            assertEquals(2,test.checkEven_or_odd(546));
        }
        @Test
        void negativeTwo_ExpectedEven() {
            assertEquals(2,test.checkEven_or_odd(-2));
        }
        @Test
        void NegativeFiveThousandSixHundredEightyFour_ExpectedEven() {
            assertEquals(2,test.checkEven_or_odd(-5684));
        }
    }
    //odd equals 1
    @Nested
    public class oddTest{
        @Test
        void One_ExpectedEven() {
            assertEquals(1,test.checkEven_or_odd(1));
        }
        @Test
        void fourThousandSixHundredFortyNine_ExpectedEven() {
            assertEquals(1,test.checkEven_or_odd(4649));
        }
        @Test
        void fiveHundredFortySeven_ExpectedEven() {
            assertEquals(1,test.checkEven_or_odd(547));
        }
        @Test
        void negativeOne_ExpectedEven() {
            assertEquals(1,test.checkEven_or_odd(-1));
        }
        @Test
        void NegativeFiveThousandSixHundredEightyThree_ExpectedEven() {
            assertEquals(1,test.checkEven_or_odd(-5683));
        }
    }

    //Neutral equals 0
    @Nested
    class neutralTest{
        @Test
        public void Zero_ExpectedNeutral(){
            assertEquals(0,test.checkEven_or_odd(0));
        }
    }

    @AfterAll
    public static void cleanup(){
        test = null;
    }

}

