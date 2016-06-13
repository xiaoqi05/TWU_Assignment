import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private PrimeFactors primeFactors;

    @Before
    public void setUp() {
        primeFactors = new PrimeFactors();
    }


    @Test
    public void shouldReturnRightList() throws Exception {
        List<Integer> generate = primeFactors.generate(30);
        List<Integer> list = Arrays.asList(2, 3, 5);
        assertEquals(list, generate);
    }

    @Test
    public void shouldReturnNullListWhenInput1() throws Exception {
        List<Integer> generate = primeFactors.generate(1);
        List<Integer> list = Collections.emptyList();
        assertEquals(list, generate);
    }


}
