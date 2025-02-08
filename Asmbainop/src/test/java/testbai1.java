import com.example.Asmbainop.baitap;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class testbai1 {
 baitap baitap = new baitap();
    @Test
    void testnhan() {
        assertEquals(20, baitap.bai1(4, 5)); // Dương * Dương
        assertEquals(-20, baitap.bai1(-4, 5)); // Âm * Dương
        assertEquals(-20, baitap.bai1(4, -5)); // Dương * Âm
        assertEquals(20, baitap.bai1(-4, -5)); // Âm * Âm
        assertEquals(0, baitap.bai1(0, 5)); // 0 * Dương
        assertEquals(0, baitap.bai1(5, 0)); // Dương * 0
        assertEquals(0, baitap.bai1(0, 0)); // 0 * 0
        assertEquals(1000000, baitap.bai1(1000, 1000)); // Số lớn
        assertEquals(-1000000, baitap.bai1(-1000, 1000)); // Số lớn * Âm
        assertEquals(1, baitap.bai1(1, 1)); // Nhỏ nhất dương
    }
}
