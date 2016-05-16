import java.util.ArrayList;
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    private String username;
    private long timestamp;
    private int likes;

    public Post(String username){
        this.username = username;
        this.timestamp = System.currentTimeMillis();
        likes = 0;
    }
    
    public String getUsername(){
        return username;
    }
    
    /**
     * Metodo para dar un like.
     */
    public void like(){
        likes++;
    }
    
    /**
     * Metodo para quitar un like en caso de que los haya.
     */
    public void unlike(){
        if(likes != 0)
           likes--; 
    }
    
    /**
     * Metodo que devuelve la estampa de tiempo en el momento de crear el post
     */
    public long getTimeStamp(){
        return timestamp;
    }
    
    /**
     * Metodo que muestra toda la info del post
     */
    public void display(){
        String info = "";
        long time = System.currentTimeMillis() - getTimeStamp();
        info += username + "\n=====================\n" + "Posted: ";
        info += timeString(time);
        info += "_____________________\nLikes: " + likes + "\n=====================\n\n";
        System.out.println(info);
    }
    
    /**
     * Metodo para pasar el tiempo a minutos y segundos.
     */
    private String timeString(long time){
        String info = "";
        int sec =  (int)(time / 1000) % 60;
        int min =  (int)((time / (1000*60)) % 60);
        if(min > 0)
            info += min + " Minutes, ";
        info += sec + " Seconds\n";
        return info;
    }
}
