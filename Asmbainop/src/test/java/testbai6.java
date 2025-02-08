import com.example.Asmbainop.baitap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testbai6 {
    baitap baitap = new baitap();
    @Test
    public void testFindMin() {
        assertEquals(1, baitap.PhanTuNhoNhat(new int[]{5, 3, 1, 4, 2}));
        assertEquals(-10,baitap. PhanTuNhoNhat(new int[]{0, -10, -5, 3}));
        assertThrows(IllegalArgumentException.class, () -> baitap.PhanTuNhoNhat(new int[]{}));
    }
}
