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
    public DarkBall()
    {
        GreenfootImage image = new GreenfootImage("images/images.jpg");
        image.scale(30,30);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
        move(10.0);
    }
    
    public void hit()
    {
        if(isTouching(Demon.class))
        {
            removeTouching(Demon.class);
            MyWorld world = (MyWorld) getWorld();
            world.gameOver();
        }
    }
    
}
