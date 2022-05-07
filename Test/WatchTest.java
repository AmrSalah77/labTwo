import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class WatchTest {
    static Watch test;
    @BeforeEach
    public void init(){
        test = new Watch();
    }
    
    @Nested
    class UpdateTest {
        @BeforeEach
        public void init () {
            test.State = "Update";
        }
        @Nested
        class updateTestInputA{
            @Test
            public void aInput_ExpectedOutputHour(){
                test.State_Update = "min";
                test.watch('a');
                assertEquals("hour", test.State_Update);
            }
            @Test
            public void aInput_ExpectedOutputDay(){
                test.State_Update = "hour";
                test.watch('a');
                assertEquals("day", test.State_Update);
            }
            @Test
            public void aInput_ExpectedOutputMonth(){
                test.State_Update = "day";
                test.watch('a');
                assertEquals("month", test.State_Update);
            }
            @Test
            public void aInput_ExpectedOutputYear(){
                test.State_Update = "month";
                test.watch('a');
                assertEquals("year", test.State_Update);
            }
            @Test
            public void aInput_ExpectedOutputNormalState(){
                test.State_Update = "year";
                test.watch('a');
                assertEquals("Normal", test.displayState());
            }
        }
        @Nested
        class updateTestInputB{
            @Test
            public void ebInputChangeMin_ExpectedOutputZero() {
                test.State_Update = "min";
                test.h = 3;
                test.m = 59;
                test.watch('b');
                assertEquals("3:0", test.displayTime());
            }
            @Test
            public void bInputChangeMin_ExpectedOutputEleven() {
                test.State_Update = "min";
                test.h = 5;
                test.m = 10;
                test.watch('b');
                assertEquals("5:11", test.displayTime());
            }
            @Test
            public void bInputChangeHour_ExpectedOutputZero() {
                test.State_Update = "hour";
                test.h = 23;
                test.m = 7;
                test.watch('b');
                assertEquals("0:7", test.displayTime());
            }
            @Test
            public void bInputChangeHour_ExpectedOutputTwelve() {
                test.State_Update = "hour";
                test.h = 11;
                test.m = 5;
                test.watch('b');
                assertEquals("12:5", test.displayTime());
            }
            @Test
            public void bInputChangeDay_ExpectedOutputOne() {
                test.State_Update = "day";
                test.D = 31;
                test.M = 5;
                test.Y = 2000;
                test.watch('b');
                assertEquals("2000-5-1", test.displayDate());
            }
            @Test
            public void bInputChangeDay_ExpectedOutputTwentyOne() {
                test.State_Update = "day";
                test.D = 20;
                test.M = 8;
                test.Y = 2005;
                test.watch('b');
                assertEquals("2005-8-21", test.displayDate());
            }
            @Test
            public void bInputChangeMonth_ExpectedOutputOne() {
                test.State_Update = "month";
                test.D = 4;
                test.M = 12;
                test.Y = 2014;
                test.watch('b');
                assertEquals("2014-1-4", test.displayDate());
            }
            @Test
            public void bInputChangeMonth_ExpectedOutputFive() {
                test.State_Update = "month";
                test.D = 5;
                test.M = 4;
                test.Y = 1989;
                test.watch('b');
                assertEquals("1989-5-5", test.displayDate());
            }
            @Test
            public void bInputChangeYear_ExpectedOutput2006() {
                test.State_Update = "year";
                test.D = 6;
                test.M = 7;
                test.Y = 2005;
                test.watch('b');
                assertEquals("2006-7-6", test.displayDate());
            }
        }
        @Nested
        class updateTestInputD{
            @Test
            public void dInput_ExpectedOutputNormalState() {
                test.watch('d');
                assertEquals("Normal", test.State);
            }
        }
    }

    @Nested
    class AlarmTest {
        @BeforeEach
        public void init() {
            test.State = "Alarm";
        }
        @Test
        public void aInput_ExpectedOutputChimeState() {
            test.State_Alarm = "Alarm";
            test.watch('a');
            assertEquals("Chime", test.State_Alarm);
        }
        @Test
        public void dInput_ExpectedOutputNormalState() {
            test.watch('d');
            assertEquals("Normal", test.displayState());
        }
    }

    @Nested
    class NormalTest {
        @BeforeEach
        public void init() {
            test.State = "Normal";
        }
        @Test
        public void aInput_ExpectedOutputDateState() {
            test.State_Normal = "Time";
            test.watch('a');
            assertEquals("Date", test.State_Normal);
        }
        @Test
        public void aInput_ExpectedOutputTimeState() {
            test.State_Normal = "Date";
            test.watch('a');
            assertEquals("Time", test.State_Normal);
        }
        @Test
        public void bInput_ExpectedOutputAlarmState() {
            test.watch('b');
            assertEquals("Alarm", test.displayState());
        }
        @Test
        public void cInput_ExpectedOutputUpdateState() {
            test.watch('c');
            assertEquals("Update", test.displayState());
        }
    }

    @AfterAll
    public static void cleanUp () {
        test = null;
    }
}

