import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    private PrintStream console = null;
    private ByteArrayOutputStream bytes = null;
    private FizzBuzzGame fizzBuzzGame;

    @Before
    public void setUp() {
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        fizzBuzzGame = new FizzBuzzGame();
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void shouldPrintFizzWhenNumberIsOnlyDivisibleByThree() throws Exception {
        //asterisk.print("hello world");
        fizzBuzzGame.fizzBuzz();
        String s = "Fizz\n";
        assertEquals(s, bytes.toString());
    }

}
