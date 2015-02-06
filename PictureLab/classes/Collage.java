

/**
 * Write a description of class Collage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collage
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class Collage
     */
    public static void createCollage()
    {
        // initialise instance variables
        Picture canvas = new Picture(646 ,1200);
        Picture rcf = new Picture("rcf.jpg");
        Picture rcf2 = new Picture("rcf.jpg");
        Picture rcf3 = new Picture("rcf.jpg");
        Picture rcf4 = new Picture("rcf.jpg");
        canvas.explore();
    }

    
}
