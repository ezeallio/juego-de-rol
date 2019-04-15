
package ejerciciopracticasjuegos;

public class Ogro{
    static int vidaO = 100;
    int random = 0;
    
    
    public void atacarmago() {
        if(vidaO>=0)
        {
            random = (int)((Math.random() * 15) + 10);
            Mago.vidaM -= random;
        }
    }
    public void atacararquero(){
    if(vidaO>=0)
        {
            random = (int)((Math.random() * 15) + 10);
            Arquero.vidaA -= random;
        }
    
    }
    
    public void atacarguerrero(){
    if(vidaO>=0)
        {
            random = (int)((Math.random() * 15) + 10);
            Guerrero.vidaG -= random;
        }
    
    }
}
