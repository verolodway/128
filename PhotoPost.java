import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost extends CommentsPost
{
    private String filename;
    private String caption;
    private ArrayList<String> comments;
    /**
     * Constructor for objects of class MessagePost
     */
    public PhotoPost(String username, String filename, String caption)
    {
       super(username);
       this.filename = filename;
       this.caption = caption;
       comments = new ArrayList<>();
    }
    
    /**
     * Meotdo que devuelve el nombre del archivo
     */
    public String getImageFile(){
        return filename;
    }
    
    public void display()
    {
        System.out.println(filename);
        System.out.println(caption);
        super.display();
    } 	
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getCaption(){
        return caption;
    }
}
