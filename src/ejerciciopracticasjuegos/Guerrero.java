
package ejerciciopracticasjuegos;


public class Guerrero{
    static int vidaG = 100;
    
    
    public void ataquebasico(){
        Ogro.vidaO -= 20;
        }

    
    void ataquecritico() {
        Ogro.vidaO -= 30;
        vidaG -= 10;
    }
    }
