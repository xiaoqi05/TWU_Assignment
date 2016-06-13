import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TWUTriangleExercisesTest {
    private TWUTriangleExercises twuExercises;
    private PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
    private ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流
    private Asterisk asterisk;

    @Before
    public void setUp() {
        twuExercises = new TWUTriangleExercises();
        bytes = new ByteArrayOutputStream();    // 分配空间
        console = System.out;                   // 获取System.out 输出流的句柄
        System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes
        asterisk = new Asterisk();
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void shouldPrintRight() throws Exception {
        asterisk.print("hello world");
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
