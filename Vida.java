import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Vida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vida extends Actor
{
    /**
     * Act - do whatever the Vida wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cantidadvida = 5;
    int longitudbarravida = 80;
    int alturabarravida = 10;
    int pixelesporpuntodevida = longitudbarravida/cantidadvida;
    public Vida(){
        update();
    }
    public void act()
    {
        perder();
        update();
    }
    public void update(){
        setImage(new GreenfootImage(longitudbarravida + 2,alturabarravida + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.BLACK);
        myImage.drawRect(0,0,longitudbarravida + 1, alturabarravida + 1); 
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, cantidadvida*pixelesporpuntodevida, alturabarravida);
    }
    public void perdervida(){
        cantidadvida--;
    }
    public void perder(){
        if (cantidadvida == 0){
             getWorld().addObject(new Perdiste(), 400, 250);
             Greenfoot.stop();
        }
    }
}
