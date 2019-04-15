//
//package ejerciciopracticasjuegos;
//
//import java.util.Scanner;
//
//public abstract class Personaje {
//    static Scanner teclado = new Scanner(System.in);
//    static int h;
//    int cont = 0;
//    
//    abstract void ataquebasico();
//    abstract void ataquecritico();
//    
//    public void elegir()
//    {
//        System.out.println("Elije un personaje:");
//        System.out.println("1.Guerrero(+100 salud)");
//        System.out.println("2.Arquero(+80 salud)");
//        System.out.println("3.Mago(+60 salud)");
//        h = teclado.nextInt();
//        
//        switch(h)
//        {
//            case 1:
//                Guerrero g = new Guerrero();
//                proceso: while(Guerrero.vidaG > 0 && Ogro.vidaO > 0)
//                {
//                    //g.atacar();
//                    if(Guerrero.vidaG <= 0)
//                    {
//                        System.out.println("\nHa ganado el Ogro!");
//                        break proceso;
//                    }
//                    else
//                        if(Ogro.vidaO <= 0)
//                        {
//                            System.out.println("\nHas ganado!");
//                            break proceso;
//                        }
//                    Ogro o = new Ogro();
//                    o.atacar();
//                }
//                break;
//                
//            case 2:
//                Arquero a = new Arquero();
//                proceso: while(Arquero.vidaA > 0 && Ogro.vidaO > 0)
//                {
//                    //a.atacar();
//                    if(Arquero.vidaA <= 0)
//                    {
//                        System.out.println("\nHa ganado el Ogro!");
//                        break proceso;
//                    }
//                    else
//                        if(Ogro.vidaO <= 0)
//                        {
//                            System.out.println("\nHas ganado!");
//                            break proceso;
//                        }
//                    Ogro o = new Ogro();
//                    o.atacar();
//                }
//                break;
//                
//            case 3:
//                Mago m = new Mago();
//                proceso: while(Mago.vidaM > 0 && Ogro.vidaO > 0)
//                {
//                    //m.atacar();
//                    if(Mago.vidaM <= 0)
//                    {
//                        System.out.println("\nHa ganado el Ogro!");
//                        break proceso;
//                    }
//                    else
//                        if(Ogro.vidaO <= 0)
//                        {
//                            System.out.println("\nHas ganado!");
//                            break proceso;
//                        }
//                    Ogro o = new Ogro();
//                    o.atacar();
//                }
//                break;
//        }
//    }
//}
