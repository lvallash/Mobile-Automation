import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CarritoDeComprasTest extends BaseTest {

    @BeforeClass
    public void setUp() throws Exception {
        setup();
    }

    @Test(dataProvider = "productos")
    public void testAgregarProductoAlCarrito(String producto, int unidades) {
        // Aquí va el código para agregar productos al carrito y verificar la funcionalidad
    }

    @DataProvider(name = "productos")
    public Object[][] productos() {
        return new Object[][] {
                {"Sauce Labs Backpack", 1},
                {"Sauce Labs Bolt - T-Shirt", 1},
                {"Sauce Labs Bike Light", 2}
        };
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
