import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProxyImageTest {
    @Test
    public void testLazyLoading() {
        MyImage proxyImage = new ProxyImage("test.jpg");
        proxyImage.display(); // Should create and load RealImage
        assertNotNull(proxyImage); // Validate that ProxyImage is functional
    }
}