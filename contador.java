import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    int puntos = 0;
    /**
     * Act - do whatever the contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("PUNTAJE: " + puntos, 20, Color.BLACK, new Color(0,0,0,0)));
    }
    public contador(){
        setImage(new GreenfootImage("PUNTAJE: " + puntos, 20, Color.BLACK, new Color(0,0,0,0)));
    }
    public void addPuntaje(){
        puntos++;
    }
}
