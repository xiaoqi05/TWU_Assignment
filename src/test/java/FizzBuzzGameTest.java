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
        String result = fizzBuzzGame.sayNumber(3);
        String s = "Fizz";
        assertEquals(s, result);
    }

    @Test
    public void shouldPrintBuzzWhenNumberIsOnlyDivisibleByThree() throws Exception {
        String result = fizzBuzzGame.sayNumber(5);
        String s = "Buzz";
        assertEquals(s, result);
    }

    @Test
    public void shouldPrintFizzBuzzWhenNumberIsOnlyDivisibleByThree() throws Exception {
        String result = fizzBuzzGame.sayNumber(15);
        String s = "FizzBuzz";
        assertEquals(s, result);
    }
}
