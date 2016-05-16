import java.util.ArrayList;
/**
 * Write a description of class Comments here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CommentsPost extends Post
{
    private ArrayList<String> comments;
    
    public CommentsPost(String username){
        super(username);
        comments = new ArrayList<>();        
    }
    
    /**
     * Metodo para añadir un comentario al post
     */
    public void addComment(String text){
        comments.add(text);
    }
    
     /**
     * Método que nos devuelve los comentarios del post
     */
    public void printComments(){
        String comentarios = "";
        if(comments.size() != 0)
            for(int i=0; i<comments.size(); i++)
                comentarios += comments.get(i) + "\n_____________________\n";
        else
            comentarios += "Sin comentarios";
    }
}
