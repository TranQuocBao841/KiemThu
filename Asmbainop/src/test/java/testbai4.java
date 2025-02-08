import com.example.Asmbainop.baitap;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class testbai4 {
    baitap baitap = new baitap();

    @Test
    void testGetElementAtIndex() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(3, baitap.getElementAtIndex(arr, 2));
        assertThrows(IndexOutOfBoundsException.class, () -> baitap.getElementAtIndex(arr, 5));
    }
}
