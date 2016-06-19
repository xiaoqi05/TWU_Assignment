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
        asteriskHelper.print("hello world");
        String s = "hello world\n";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintOneAsteriskWhenInput() throws Exception {
        twuExercises.drawAsterisk();
        String s = "*\n";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintNAsterisksOnOneLineWhenInputN() throws Exception {
        twuExercises.drawAsterisks(8);
        String s = "********\n";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrint0AsterisksWhenInputNumberIsNonPositive() throws Exception {
        twuExercises.drawAsterisks(-1);
        String s = "\n";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintNRowsAsteriskWhenInputN() throws Exception {
        twuExercises.drawRowsAsterisk(3);
        String s = "*\n*\n*\n";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrint0RowsAsteriskWhenInputNumberIsNonPositive() throws Exception {
        twuExercises.drawRowsAsterisk(-1);
        String s = "";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintRightTriangleWithNAsteriskSideLengthWhenInputN() throws Exception {
        twuExercises.drawRightTriangle(3);
        String s = "*\n**\n***\n";
        assertEquals(s, bytes.toString());
    }

}
