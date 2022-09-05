import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    Product p1, p2, p3;

    @BeforeEach
    void setUp() {
        Product.startSeed(0);
        p1 = new Product("Tree Log", "Logs that come from trees",  7.06);
        p2 = new Product("Bird Seed", "Food that feed birds",  13.99);
        p3 = new Product("Cat Food", "Cats eat this",  19.69);

    }

    @Test
    void getID() {
        assertEquals(0, Product.startSeed());
    }

    @Test
    void setName() {
        p1.setName("Tree Log");
        assertEquals("Tree Log", p1.getName());
        p2.setName("Bird Seed");
        assertEquals("Bird Seed", p2.getName());
        p3.setName("Cat Food");
        assertEquals("Cat Food", p3.getName());
    }

    @Test
    void setDescription() {
        p1.setDescription("Logs that come from trees");
        assertEquals("Logs that come from trees", p1.getDescription());
        p2.setDescription("Food that feed birds");
        assertEquals("Food that feed birds", p2.getDescription());
        p3.setDescription("Cats eat this");
        assertEquals("Cats eat this", p3.getDescription());
    }

    @Test
    void setCost() {
        p1.setCost(7.06);
        assertEquals(7.06, p1.getCost());
        p2.setCost(13.99);
        assertEquals(13.99, p2.getCost());
        p3.setCost(19.69);
        assertEquals(19.69, p3.getCost());
    }
}