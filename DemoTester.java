import static org.junit.Assert.*;
import org.junit.*;

public class DemoTester {
    @Test
    public void multiply() {
        assertEquals(16, Demo.multiply(4, 5));
    }
}
