package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();

    @Test
    public void testFalse(){
        Assert.assertFalse(app.isEqual(1,2));
    }
}
