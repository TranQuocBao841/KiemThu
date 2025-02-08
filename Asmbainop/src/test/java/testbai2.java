import com.example.Asmbainop.baitap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class testbai2 {
   baitap baitap = new baitap();

    @Test
    void testDivide() {
        assertEquals(2, baitap.bai2(10, 5));
        assertEquals(-2, baitap.bai2(-10, 5));
        assertEquals(-2, baitap.bai2(10, -5));
        assertEquals(2, baitap.bai2(-10, -5));
        assertEquals(0, baitap.bai2(0, 5));
        assertThrows(ArithmeticException.class, () -> baitap.bai2(10, 0)); // Chia cho 0
    }
}
