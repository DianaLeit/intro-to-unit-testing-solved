import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.annotation.Target;

import org.junit.Test;

/**
 * The class containing your tests for the {@link Demo} class. Make sure you
 * test all methods in this class (including both
 * {@link Demo#main(String[])} and
 * {@link Demo#isTriangle(double, double, double)}).
 */
public class DemoTest {
    // equilateral and acute
    @Test
    public void testIsTriangle_1() {
        assertTrue(Demo.isTriangle(1, 1, 1));
    }

    // right
    @Test
    public void testIsTriangle_2() {
        assertTrue(Demo.isTriangle(3, 4, 5));
    }

    // isosceles
    @Test
    public void testIsTriangle_3() {
        assertTrue(Demo.isTriangle(2, 2, 3));
    }

    // obtuse
    @Test
    public void testIsTriangle_4() {
        assertTrue(Demo.isTriangle(10, 14, 18));
    }

    @Test
    public void testIsTriangle_5() {
        assertTrue(Demo.isTriangle(14, 18, 10));
    }

    @Test
    public void testIsTriangle_6() {
        assertTrue(Demo.isTriangle(18, 10, 14));
    }

    @Test
    public void testIsTriangle_7() {
        assertTrue(Demo.isTriangle(0.5, 0.5, 0.9));
    }

    @Test
    public void testIsTriangle_8() {
        assertTrue(Demo.isTriangle(10000, 10040, 988));
    }

    //Not triangles
    @Test
    public void testIsNotTriangle_1() {
        assertFalse(Demo.isTriangle(2, 10, 14));
    }

    @Test
    public void testIsNotTriangle_2() {
        assertFalse(Demo.isTriangle(10, 14, 2));
    }

    @Test
    public void testIsNotTriangle_3() {
        assertFalse(Demo.isTriangle(14, 2, 10));
    }

    @Test
    public void testIsNotTriangle_4() {
        assertFalse(Demo.isTriangle(14, 2, -10));
    }

    @Test
    public void testIsNotTriangle_5() {
        assertFalse(Demo.isTriangle(14, 0, 10));
    }

    @Test
    public void testIsNotTriangle_6() {
        assertFalse(Demo.isTriangle(0, 0, 0));
    }

    @Test
    public void testIsNotTriangle_7() {
        assertFalse(Demo.isTriangle(-1, -1, -1));
    }

    @Test
    public void testIsNotTriangle_8() {
        assertFalse(Demo.isTriangle(1, 0.5, 0.5));
    }

    @Test
    public void testMainProgram() {
        String input = "10\n14\n18\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }

    @Test
    public void testMainProgramFail() {
        String input = "10\n14\n2\n";

        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        String[] args = {};
        Demo.main(args);

        String consoleOutput = "Enter side 1: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 2: " + System.getProperty("line.separator");
        consoleOutput += "Enter side 3: " + System.getProperty("line.separator");
        consoleOutput += "This is not a triangle." + System.getProperty("line.separator");

        assertEquals(consoleOutput, out.toString());
    }
}
