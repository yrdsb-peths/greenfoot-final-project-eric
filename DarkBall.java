import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DarkBall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DarkBall extends Mover
{
    /**
     * Act - do whatever the DarkBall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void DarkBall()
    {
        GreenfootImage image = getImage();
        image.scale(10,10);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        move(10.0);
    }
    
}
