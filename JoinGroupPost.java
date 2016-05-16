
/**
 * Write a description of class JoinGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JoinGroupPost extends Post
{
    private String grupo;

    /**
     * Constructor for objects of class MessagePost
     */
    public JoinGroupPost(String username, String group)
    {
       super(username);
       grupo = group;
    }
    
    /**
     * Metodo que devuelve el mensaje del post
     */
    public String getGrupo(){
        return grupo;
    }
    
    public void printShortSummary(){
        System.out.println("El usuario: " + getUsername() + " se ha unido al grupo: " + getGrupo());
    }
}
