import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class demon here.
 * 
 * @author Eric Zheng 
 * @version June 2022
 */
public class Demon extends Actor
{
    GreenfootImage demon = new GreenfootImage("images/download.jpg");
    /**
     * Act - do whatever the demon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Demon()
    {
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
        
    }
    public void act()
    {
        // Add your action code here.
    }
    
    public void Attack()
    {
        
    }
}
