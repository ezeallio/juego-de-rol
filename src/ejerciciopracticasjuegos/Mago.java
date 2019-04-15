
package ejerciciopracticasjuegos;

public class Mago{
    static int vidaM = 60;
    int random = 0;
    boolean paraliza = true;
    
    void ataquebasico() {
                Ogro.vidaO -= 30;
                
                
    }

    void ataquecritico() {
                Ogro.vidaO -= 20;
                random = (int) (Math.random() * 10);
                if(random >= 5)
                {
                    paraliza = false;
                }
    }
    
}
