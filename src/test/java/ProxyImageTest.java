import com.MyImage;
import com.ProxyImage;
import com.RealImage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProxyImageTest {
    @Test
    public void testLazyLoading() {
        // Assuming test.jpg exists in src/test/resources
        MyImage proxyImage = new ProxyImage("test.jpg");
        try {
            proxyImage.display(); // This should not throw an exception
        } catch (Exception e) {
            fail("Error loading or displaying the image: " + e.getMessage());
        }

        // Check that the proxy image is not null
        assertNotNull(proxyImage);
    }
}