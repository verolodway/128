import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends Post
{
    private String filename;
    private String caption;

    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String username, String filename, String caption)
    {
       super(username);
       this.filename = filename;
       this.caption = caption;
    }
    
    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }
}
