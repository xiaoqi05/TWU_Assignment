import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TriangleExercisesTest {
    private TriangleExercises twuExercises;
    private PrintStream console = null;
    private ByteArrayOutputStream bytes = null;
    private AsteriskHelper asteriskHelper;

    @Before
    public void setUp() {
        twuExercises = new TriangleExercises();
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
        asteriskHelper = new AsteriskHelper();
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void shouldPrintRight() throws Exception {
        String s = "hello world\n";
        asteriskHelper.print("hello world");
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintOneAsteriskWhenInput() throws Exception {
        String s = "*\n";
        twuExercises.drawAsterisk();
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintNAsterisksOnOneLineWhenInputN() throws Exception {
        String s = "********\n";
        twuExercises.drawAsterisks(8);
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrint0AsterisksWhenInputNumberIsNonPositive() throws Exception {
        String s = "\n";
        twuExercises.drawAsterisks(-1);
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintNRowsAsteriskWhenInputN() throws Exception {
        String s = "*\n*\n*\n";
        twuExercises.drawRowsAsterisk(3);
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrint0RowsAsteriskWhenInputNumberIsNonPositive() throws Exception {
        String s = "";
        twuExercises.drawRowsAsterisk(-1);
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintRightTriangleWithNAsteriskSideLengthWhenInputN() throws Exception {
        String s = "*\n**\n***\n";
        twuExercises.drawRightTriangle(3);
        assertEquals(s, bytes.toString());
    }

}
