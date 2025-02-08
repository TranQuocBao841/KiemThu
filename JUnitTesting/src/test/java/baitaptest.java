import com.example.JUnitTesting.baitap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class baitaptest {
    @Test
    void tesTong() {
        assertEquals(5, baitap.Tong(2, 3));
        assertEquals(0, baitap.Tong(0, 0));
        assertEquals(2, baitap.Tong(1, 1));
        assertEquals(4, baitap.Tong(2, 2));
        assertEquals(6, baitap.Tong(3, 3));

    }

    @Test
    void testChia() {
        assertEquals(1, baitap.Chia(3, 2));
        assertEquals(2, baitap.Chia(4, 2));
        assertEquals(3, baitap.Chia(6, 2));
        assertEquals(4, baitap.Chia(8, 2));
        assertEquals(0, baitap.Chia(2, 0));
    }
    @Test
    void testNhan() {
        assertEquals(6, baitap.Nhan(2, 3));
        assertEquals(4, baitap.Nhan(2, 2));
        assertEquals(8, baitap.Nhan(2, 4));
        assertEquals(10, baitap.Nhan(2, 5));
        assertEquals(12, baitap.Nhan(2, 6));
    }

    @Test
    void testHieu(){
        assertEquals(1,baitap.Hieu(2,1));
        assertEquals(2,baitap.Hieu(3,1));
        assertEquals(3,baitap.Hieu(4,1));
        assertEquals(4,baitap.Hieu(5,1));
        assertEquals(5,baitap.Hieu(6,1));
    }
    @Test
    void TongNle(){
        assertEquals(1,baitap.TongNsole(1));
        assertEquals(9,baitap.TongNsole(3));
        assertEquals(25,baitap.TongNsole(5));
    }

    @Test
    void TongNsoNguyen(){
            assertEquals(15, baitap.TongNsoNguyen(5));
            assertEquals(0, baitap.TongNsoNguyen(0));
            assertEquals(55, baitap.TongNsoNguyen(10));
        }

    @Test
    void Vitri() {
        int[] array = {1, 3, 5, 3};
        assertEquals(1, baitap.TimViTri(array, 3));
    }

    @Test
    void TBC(){
        assertEquals(4.0, baitap.tinhTrungBinhCong(new int[]{2, 4, 6}));
        assertEquals(-6.0, baitap.tinhTrungBinhCong(new int[]{-3, -6, -9}));
    }
}

