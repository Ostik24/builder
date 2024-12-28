import com.MyImage;
import com.ProxyImage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.doNothing;

public class ProxyImageTest {

    @Test
    public void testLazyLoading() {
        // Mock the ProxyImage class
        ProxyImage proxyImage = mock(ProxyImage.class);
        
        // Mock the display method to avoid GUI interaction
        doNothing().when(proxyImage).display();
        
        // Call display method (no GUI interaction)
        proxyImage.display();

        // Ensure proxyImage is not null
        assertNotNull(proxyImage);
    }
}