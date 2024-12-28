import com.MyImage;
import com.ProxyImage;
import com.RealImage;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProxyImageTest {
    @Test
    public void testLazyLoading() {
        // Create a mock of RealImage
        RealImage mockRealImage = mock(RealImage.class);
        when(mockRealImage.display()).thenReturn(null); // Mock the display method

        MyImage proxyImage = new ProxyImage("test.jpg");
        proxyImage.display(); // This will call the mocked display method

        verify(mockRealImage).display(); // Verify that display() was called
        assertNotNull(proxyImage);
    }
}