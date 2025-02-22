import com.example.SanPham.SanPham;
import com.example.SanPham.SanPhamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SanPhamServiceTest {
    private SanPhamService sanPhamService;

    @BeforeEach
    public void upset(){
    sanPhamService = new SanPhamService();
    }


    @Test
    void testThemSanPham() {
        SanPham sp = new SanPham("SP001", "Laptop", 2, 1500.5f, 10, "Điện tử");
        sanPhamService.themSanPham(sp);
        assertEquals(1, sanPhamService.getDanhSachSanPham().size());
    }

    @Test
    void testXoaSanPham() {
        SanPham sp = new SanPham("SP002", "Điện thoại", 1, 500.0f, 5, "Điện tử");
        sanPhamService.themSanPham(sp);
        assertTrue(sanPhamService.xoaSanPham("SP002"));
        assertFalse(sanPhamService.xoaSanPham("SP999")); // Mã không tồn tại
    }

    @Test
    void testKiemTraMaTonTai() {
        SanPham sp = new SanPham("SP003", "Máy ảnh", 3, 700.0f, 3, "Máy ảnh");
        sanPhamService.themSanPham(sp);
        assertTrue(sanPhamService.kiemTraMaTonTai("SP003"));
        assertFalse(sanPhamService.kiemTraMaTonTai("SP999")); // Mã không tồn tại
    }
}

