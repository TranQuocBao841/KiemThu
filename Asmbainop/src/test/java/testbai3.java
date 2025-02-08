import com.example.Asmbainop.baitap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testbai3 {
    baitap baitap = new baitap();
    @Test
    public void testAverage() {
        assertEquals(3.0, baitap.average(new int[]{1, 2, 3, 4, 5}));
        assertEquals(0.0,baitap. average(new int[]{0, 0, 0}));
        assertThrows(ArithmeticException.class, () -> baitap.average(new int[]{}));
    }
}
