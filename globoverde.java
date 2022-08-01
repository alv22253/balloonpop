import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class globoverde here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class globoverde extends Actor
{
    GifImage globo = new GifImage("globoverdegif.gif");
    public globoverde(){
        GreenfootImage globoverde = getImage();
        globoverde.scale(39,102);
    }
    public void act()
    {
        setImage(globo.getCurrentImage());
        GreenfootImage globoverde = getImage();
        globoverde.scale(39,102);
        moveGlobo();
        pinchado();
    }
    public void moveGlobo(){
        setLocation(getX(), getY()-2);
    }
    public void pinchado(){
        Actor flecha = getOneIntersectingObject(flecha.class);
        if (flecha != null){
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld)mundo;
            contador cont = mimundo.getcontador();
            cont.addPuntaje();
            getWorld().removeObject(this);
        }else if (getY()==0){
            World mundo = getWorld();
            MyWorld mimundo = (MyWorld)mundo;
            Vida vida = mimundo.getVida();
            vida.perdervida();
            getWorld().removeObject(this);
        }
    }
}

