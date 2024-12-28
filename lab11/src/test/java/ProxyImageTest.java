import com.MyImage;
import com.ProxyImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

public class ProxyImageTest {
    @Test
    public void testLazyLoading() {
        MyImage proxyImage = new ProxyImage("test.jpg");
        try {
            proxyImage.display();
        } catch (Exception e) {
            fail("Error loading or displaying the image: " + e.getMessage());
        }

        assertNotNull(proxyImage);
    }
}