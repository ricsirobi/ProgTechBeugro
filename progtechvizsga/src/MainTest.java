import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{

    @Test
    public void test1() throws Exception {
        String result = Main.RészString("kutya","100%");
        assertEquals("kutya", result);
    }

    @Test
    public void test2() throws Exception {
        String result = Main.RészString("kutya","40%");
        assertEquals("ku", result);
    }

    @Test
    public void test3() throws Exception {
        String result = Main.RészString("kutya","0%");
        assertEquals("", result);
    }

}