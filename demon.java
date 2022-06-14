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
    GreenfootImage demon = new GreenfootImage("images/demon.jpg");
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
        
    }
    
    public void Attack()
    {
        Fireball fireball = new Fireball();
        getWorld().addObject(fireball, getX(), getY());
        fireball.setRotation(getRotation());
        
        
    }
}
