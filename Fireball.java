import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A fireball is the demon/player's way to attack.
 * 
 * @author Eric Zheng
 * @version june 2022
 */
public class Fireball extends Mover
{
    public int kills = 0;

    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball()
    {
        GreenfootImage image = getImage();
        image.scale(15,15);
        setImage(image);
    }

    public void act()
    {
        // Add your action code here.
        move(10.0);

        // Remove mob after fireball hits it.
        destroy();

    }

    /**
     * the interaction when fireball hits a creep
     */
    public void destroy()
    {
        if(isTouching(Creep.class))
        {
            removeTouching(Creep.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
        }

    }

}

