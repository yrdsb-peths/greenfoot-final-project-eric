import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A darkball is the creep's way to attack.
 * 
 * @author Eric Zheng
 * @version June 2022
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
        MyWorld world = (MyWorld) getWorld();
        if(world.score>=5)
        {
            move(10.0);
        }
        else
        {
            move();
        }
        if(isTouching(Demon.class))
        {
            hit();
        }

    }

    /**
     * the interaction when the darkball hits the demon/player
     */
    public void hit()
    {

        removeTouching(Demon.class);

        Greenfoot.setWorld(new EndScreen());

    }

}
