import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }


    @Test
    public void shouldPrintFizzWhenNumberIsOnlyDivisibleByThree() throws Exception {
        String s = "Fizz";
        String result = fizzBuzzGame.sayNumber(3);
        assertEquals(s, result);
    }

    @Test
    public void shouldPrintBuzzWhenNumberIsOnlyDivisibleByThree() throws Exception {
        String s = "Buzz";
        String result = fizzBuzzGame.sayNumber(5);
        assertEquals(s, result);
    }

    @Test
    public void shouldPrintFizzBuzzWhenNumberIsOnlyDivisibleByThree() throws Exception {
        String s = "FizzBuzz";
        String result = fizzBuzzGame.sayNumber(15);
        assertEquals(s, result);
    }

    @Test
    public void shouldPrintNumberWhenNumberIsOnlyNotDivisibleByThreeAndFive() throws Exception {
        String s = "16";
        String result = fizzBuzzGame.sayNumber(16);
        assertEquals(s, result);
    }
}
