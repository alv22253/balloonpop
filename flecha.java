import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flecha extends Actor
{
    /**
     * Act - do whatever the flecha wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public flecha(){
        GreenfootImage flecha = getImage();
        flecha.scale(90, 36);
    }
    public void act(){
        moveflecha();
        usarflecha();
    }
    public void moveflecha(){
        move(14);
    }
    public void usarflecha(){
        if (getY()==0){
            getWorld().removeObject(this);
        }else if (getY()==499){
            getWorld().removeObject(this);
        }else if (getX()==0){
            getWorld().removeObject(this);
        }else if (getX()==799){
            getWorld().removeObject(this);
        }
    }
    
}
