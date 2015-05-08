import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class GrayImageTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GrayImageTest
{
    private GrayImage grayImag1, grayImag2;

    /**
     * Default constructor for test class GrayImageTest
     */
    public GrayImageTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        int[][] imageValues1 = {{255, 184, 178,  84, 129},
                               {  84, 255, 255, 130,  84},
                               {  78, 255,   0,   0,  78},
                               {  84, 130, 255, 130,  84}};
        grayImag1 = new GrayImage(imageValues1);
        
        int[][] imageValues2 = {{221, 184, 178,  84, 135},
                               {  84, 255, 255, 130,  84},
                               {  78, 255,   0,   0,  78},
                               {  84, 130, 255, 130,  84}};
        grayImag2 = new GrayImage(imageValues2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testCountWhitePixels()
    {
        assertEquals(5, grayImag1.countWhitePixels());
    }

    @Test
    public void testProcessImage()
    {
        grayImag2.processImage();
        int[][] result = grayImag2.getPixelValues();
        int[][] expected    = {{221, 184, 100,  84, 135},
                               {0  , 125, 171, 130,  84},
                               {78 , 255,   0,   0,  78},
                               {84 , 130, 255, 130,  84}};
        assertArrayEquals(expected, result);
    }
}


