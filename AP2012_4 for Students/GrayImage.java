public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /** the 2-dimensional representation of this imafe.  Gauranteed not to be <code>null</code>.
     * All values in the array are within the range <code>[BLACK, WHITE]</code>, inclusive.
     */

    private int[ ][ ] pixelValues;

    /**
     * Constructor for objects of class GrayImage
     */
    public GrayImage(int [][] imageValues)
    {
        pixelValues = imageValues;  
    }
    
    /** added for testing */
    public int[][] getPixelValues()
    {
        return pixelValues;
    }

    /** @return the total number of white pixels in this image
     * <b>Postcondition:</b> this image has not been changed. 
     */
    public int countWhitePixels()
    { /* to be implemented in part (a) */
        
    }

    /** Process this image in row-major order and decreases the value of each pixel at
     *  postion (row, col) by the value of the pixel at position (row + 2, col + 2) if it exists.
     *  Resulting values that would be less than BLACK are replaced by BLACK.
     *  Pixels for which there is no pixel at position (row + 2, col + 2) are unchanged.
     */
    public void processImage()
    { /* to be implemented in part(b) */
        
    }
}

