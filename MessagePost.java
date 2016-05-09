import java.util.ArrayList;
/**
 * Write a description of class MessagePost here.
 * 
 * @author Vero 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;
    
    public MessagePost(String author, String text){
        username = author;
        message = text;
        likes = 0;
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
    
    public String getText(){
        return message;
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
