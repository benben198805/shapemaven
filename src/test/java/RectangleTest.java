import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void should_get_area_for_rectangle() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.getArea(), 2);
    }
}
