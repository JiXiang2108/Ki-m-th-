import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class Testing {
    @Test
    public void testcase1() {
        Assert.assertEquals("Giá vé 55000", Main.caculatePrice(0, "ngày thường"));
    }

    @Test
    public void testcase2() {
        Assert.assertEquals("Giá vé 55000", Main.caculatePrice(1, "ngày thường"));
    }

    @Test
    public void testcase3() {
        Assert.assertEquals("Giá vé 75000", Main.caculatePrice(50, "ngày thường"));
    }

    @Test
    public void testcase4() {
        Assert.assertEquals("Giá vé 75000", Main.caculatePrice(99, "ngày thường"));
    }

    @Test
    public void testcase5() {
        Assert.assertEquals("Giá vé 75000", Main.caculatePrice(100, "ngày thường"));
    }

    @Test
    public void testcase6() {
        Assert.assertEquals("Giá vé 65000", Main.caculatePrice(0, "ngày cuối tuần"));
    }

    @Test
    public void testcase7() {
        Assert.assertEquals("Giá vé 65000", Main.caculatePrice(1, "ngày cuối tuần"));
    }

    @Test
    public void testcase8() {
        Assert.assertEquals("Giá vé 95000", Main.caculatePrice(50, "ngày cuối tuần"));
    }

    @Test
    public void testcase9() {
        Assert.assertEquals("Giá vé 95000", Main.caculatePrice(99, "ngày cuối tuần"));
    }

    @Test
    public void testcase10() {
        Assert.assertEquals("Giá vé 95000", Main.caculatePrice(100, "ngày cuối tuần"));
    }

    @Test
    public void testcase11() {
        Assert.assertEquals("Đầu vào không hợp lệ", Main.caculatePrice(101, "ngày cuối tuần"));
    }

    @Test
    public void testcase12() {
        Assert.assertEquals("Đầu vào không hợp lệ", Main.caculatePrice(-1, "ngày thường"));
    }

    @Test
    public void allUses1() {
        Assert.assertEquals("Đầu vào không hợp lệ", Main.caculatePrice(101, "ngày cuối tuần"));
    }

    @Test
    public void allUses2() {
        Assert.assertEquals("Giá vé 55000", Main.caculatePrice(19, "ngày thường"));
    }

    @Test
    public void allUses3() {
        Assert.assertEquals("Giá vé 65000", Main.caculatePrice(19, "ngày cuối tuần"));
    }

    @Test
    public void allUses4() {
        Assert.assertEquals("Giá vé 75000", Main.caculatePrice(30, "ngày thường"));
    }

    @Test
    public void allUses5() {
        Assert.assertEquals("Giá vé 95000", Main.caculatePrice(30, "ngày cuối tuần"));
    }
}
