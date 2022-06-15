import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class demon here.
 * 
 * @author Eric Zheng 
 * @version June 2022
 */
public class Demon extends Actor
{
    static int x, y;
    GreenfootImage[] demo = new GreenfootImage[5];
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootSound demonSound = new GreenfootSound("demon.wav");
    /**
     * Act - do whatever the demon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Demon()
    {
        for(int i= 0 ; i<demo.length; i++)
        {
            demo[i] = new GreenfootImage("images/tile00" + i + ".png"); 
            demo[i].scale(50,50);
        }
        setImage(demo[0]);
        animationTimer.mark();

    }
    /**
     * Animate the demon
     */
    int imageIndex = 0;
    public void animateDemon()
    {
        if(animationTimer.millisElapsed()<50)
        {
            return;
        }
        animationTimer.mark();
        setImage(demo[imageIndex]);
        imageIndex = (imageIndex + 1) % demo.length;

    }

    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(3);
        }
        if(Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(3);
        }
        if(Greenfoot.isKeyDown("a"))
        {
            setRotation(180);
            move(3);
        }
        if(Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(3);
        } 
        if("space".equals(Greenfoot.getKey()))
        {
            Attack();
        }
        x = getX();
        y = getY();

        // Animate the demon
        animateDemon();

    }

    public void Attack()
    {
        Fireball fireball = new Fireball();
        getWorld().addObject(fireball, getX(), getY());
        fireball.setRotation(getRotation());
        demonSound.play();

    }

}
