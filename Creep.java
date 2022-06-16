import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creeps are the enemies.
 * 
 * @author Eric Zheng
 * @version June 2022
 */
public class Creep extends Actor
{
    SimpleTimer shotTimer = new SimpleTimer();

    /**
     * constructor for Creep class
     */

    public Creep()
    {
        GreenfootImage image = getImage();
        image.scale(30,30);
        setImage(image);
    }

    /**
     * Act - do whatever the creep wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act()
    {
        // Add your action code here.
        if(shotTimer.millisElapsed()>500)
        {
            attack();
        }

        setRotation(point_to(Demon.x, Demon.y));
    }

    /**
     * the way creeps attack
     */
    public void attack()
    {
        if(shotTimer.millisElapsed() > 3000)
        {
            DarkBall darkBall = new DarkBall();
            getWorld().addObject(darkBall, getX(), getY());
            darkBall.setRotation(getRotation());
            shotTimer.mark();
        }      

    }
    /**
     * the way creeps turn to demons
     */
    public int point_to(int x, int y) 
    {
        int dx = x - getX(); 
        int dy = y - getY(); 
        double rotation = Math.atan2(dy, dx); 
        rotation = Math.toDegrees(rotation); 
        return (int)rotation; 
    }

}
