import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TWUDiamondExercisesTest {
    private TWUDiamondExercises twuExercises;
    private PrintStream console = null;          // 声明（为null）：输出流 (字符设备) console
    private ByteArrayOutputStream bytes = null;  // 声明（为null）：bytes 用于缓存console 重定向过来的字符流

    @Before
    public void setUp() {
        twuExercises = new TWUDiamondExercises();
        bytes = new ByteArrayOutputStream();    // 分配空间
        console = System.out;                   // 获取System.out 输出流的句柄
        System.setOut(new PrintStream(bytes));  // 将原本输出到控制台Console的字符流 重定向 到 bytes
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void shouldPrintIsoscelesTriangleWithNAsteriskSideLengthWhenInputN() throws Exception {
        twuExercises.drawIsoscelesTriangle(3);
        String s = "  *  \n *** \n*****\n\n";
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintCenteredDiamondWithNAsteriskSideLengthWhenInputN() throws Exception {
        twuExercises.drawDiamond(3);
        String s = "  *  \n *** \n*****\n *** \n  *  \n\n";
        assertEquals(s, bytes.toString());
    }


}
