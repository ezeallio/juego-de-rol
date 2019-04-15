
package ejerciciopracticasjuegos;


public class Arquero{
    static int vidaA = 80;
    int random=0;
    boolean ataque = true;
    
    void ataquebasico() {
        while(random < 10)
                {
                    random = (int) ((Math.random() * 20) + 10);
                }
                Ogro.vidaO -= random;
    }

    
    void ataquecritico() {
        random = (int) (Math.random() * 10);
                if(random <= 3)
                {
                    Ogro.vidaO -= 40;
                }
                else
                {
                    ataque = false;
                }
    }
    
}
