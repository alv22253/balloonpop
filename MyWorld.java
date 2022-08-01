import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{
    Vida vida = new Vida();
    contador cont = new contador();
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(800, 500, 1);
        prepare();
    }
    public void act(){
        addGloboVerde();
    }
    public Vida getVida(){
        return vida;
    }
    public contador getcontador(){
        return cont;
    }
    private void prepare()
    {
        addObject(cont, 65, 30);
        addObject(vida, 725, 30);
        addObject(new ballesta(), 400, 30);        
    }
    public void addGloboVerde(){
        globoverde globo = new globoverde();
        if (Greenfoot.getRandomNumber(150)<1){
         addObject(globo, Greenfoot.getRandomNumber(801), 500);
         
        }
    }
}
