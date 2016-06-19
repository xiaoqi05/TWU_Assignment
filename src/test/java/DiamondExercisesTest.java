import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class DiamondExercisesTest {
    private DiamondExercises twuExercises;
    private PrintStream console = null;
    private ByteArrayOutputStream bytes = null;

    @Before
    public void setUp() {
        twuExercises = new DiamondExercises();
        bytes = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(bytes));
    }

    @After
    public void tearDown() {
        System.setOut(console);
    }

    @Test
    public void shouldPrintIsoscelesTriangleWithNAsteriskSideLengthWhenInputN() throws Exception {
        String s = "  *  \n *** \n*****\n";
        twuExercises.drawIsoscelesTriangle(3);
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintCenteredDiamondWithNAsteriskSideLengthWhenInputN() throws Exception {
        String s = "  *  \n *** \n*****\n *** \n  *  \n";
        twuExercises.drawDiamond(3);
        assertEquals(s, bytes.toString());
    }

    @Test
    public void shouldPrintCenteredDiamondWithNameInMiddle() throws Exception {
        String s = "  *  \n *** \nxiaoqi\n *** \n  *  \n";
        twuExercises.drawDiamondWithNameInMiddle(3);
        assertEquals(s, bytes.toString());
    }


}
