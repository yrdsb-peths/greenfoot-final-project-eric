import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class creep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creep extends Actor
{
    /**
     * Act - do whatever the creep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Creep()
    {
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
