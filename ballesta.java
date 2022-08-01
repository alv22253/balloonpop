import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ballesta here.
 * 
 * @author (Pablo Alvarado) 
 * @version (1)
 */
public class ballesta extends Actor
{
    boolean recarga = true;
    /**
     * Act - do whatever the ballesta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public ballesta(){
        GreenfootImage ballesta = getImage();
        ballesta.scale((int)ballesta.getWidth()/16, (int)ballesta.getHeight()/16);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            turn(-9);
        }
        if(Greenfoot.isKeyDown("left")){
            turn(9);
        }
        disparar();
    }
    
    public void disparar(){
        flecha flech = new flecha();
        if(Greenfoot.isKeyDown("space") && recarga == true){
            getWorld().addObject(flech, 400, 30);
            flech.setRotation(getRotation() + 90);
            recarga = false;
        }else if (!Greenfoot.isKeyDown("space")){
            recarga = true;
        }
    }
    
}
