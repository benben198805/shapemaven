import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void should_get_area_as_2_for_rectangle_with_1_width_and_2_height() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.getArea(), 2);
    }

    @Test
    public void should_get_perimeter_as_4_for_rectangle_with_1_width_and_2_height() {
        Rectangle rectangle = new Rectangle(1, 2);
        Assert.assertEquals(rectangle.getPerimeter(), 6);
    }
}
