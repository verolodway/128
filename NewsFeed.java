import java.util.ArrayList;
/**
 * Write a description of class NewsFeed here.
 * 
 * @author Vero 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    
    public NewsFeed(){
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }
    
    public void addMessagePost(MessagePost message){
        messages.add(message);
    }
    
    public void addPhotoPost(PhotoPost photo){
        photos.add(photo);
    }
    
    public void show(){
        for (MessagePost mensaje : messages){
           mensaje.display();
        }
        for (PhotoPost foto : photos){
            foto.display();
        }
    }
}
