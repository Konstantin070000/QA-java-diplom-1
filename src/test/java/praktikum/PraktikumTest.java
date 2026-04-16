package praktikum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PraktikumTest {

    private final PrintStream originalOut = System.out;
    private ByteArrayOutputStream outputStream;

    @Before
    public void setUp() {
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    public void shouldCreatePraktikumObject() {
        Praktikum praktikum = new Praktikum();

        assertNotNull(praktikum);
    }

    @Test
    public void mainShouldPrintCorrectReceipt() {
        Praktikum.main(new String[]{});

        String actualOutput = outputStream.toString();

        String expectedOutput = String.format(
                "(==== %s ====)%n" +
                        "= %s %s =%n" +
                        "= %s %s =%n" +
                        "= %s %s =%n" +
                        "(==== %s ====)%n" +
                        "%nPrice: %f%n%n",
                "black bun",
                "sauce", "sour cream",
                "filling", "cutlet",
                "filling", "dinosaur",
                "black bun",
                700F
        );

        assertEquals(expectedOutput, actualOutput);
    }
}