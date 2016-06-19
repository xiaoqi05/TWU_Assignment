import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private ByteArrayOutputStream bytes;
    @Before
    public void setUp() throws Exception {
        bytes = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bytes));

    }

    @Test
    public void shouldPrintRight() throws Exception {
        String expect = "hello printer\n";
        Printer.print("hello printer");
        assertEquals(expect, bytes.toString());
    }

}
