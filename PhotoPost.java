import java.util.ArrayList;
/**
 * Write a description of class PhotoPost here.
 * 
 * @author Vero
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    
    public PhotoPost(String autor, String filename, String caption){
        username = autor;
        filename = this.filename;
        caption = this.caption;
        likes = 0;
        comments = new ArrayList<>();
        long timestamp = System.currentTimeMillis();
    }
    
    public void like(){
        likes = likes++;
    }
    
    public void unlike(){
        if (likes <= 0){
            likes = 0;
        }
        else{
            likes = likes--;
        }
    }
    
    public void addComment(String text){
        comments.add(text);
    }
    
    public String getImageFile(){
        return filename;
    }
    
    public String getCaption(){
        return caption;
    }
    
    public long getTimeStamp(){
        return timestamp;
    }
    
    public void display(){
        if(comments == null){
            System.out.println( "Likes: "+ likes + "\n" + " No hay mensajes todavía.");
        }
        else{
            String comentarios = "Comentarios: ";
            for (String mensaje : comments){
                comentarios += mensaje + " ";
            }
            System.out.println( "Likes: " + likes + "\n" + "Comentarios: " + comentarios);
        }
    }
    
    public String timeString(long time){
        long tiempo1 = System.currentTimeMillis();
        long total = (tiempo1 - timestamp)/1000;
        long minutos = total/60;
       
        return "Hace: " + minutos + " minutos y " + total + " segundos";
    }
}
