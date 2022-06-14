import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class creep here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Creep extends Actor
{
    public int pause = 100;
    
 


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
       if(pause>0)
       pause--;
       if(pause == 0)
       {
           attack();
       }
        
        
        setRotation(point_to(Demon.x, Demon.y));
        
    }
    
    public void attack()
    {
        Fireball fireball = new Fireball();
        getWorld().addObject(fireball, getX(), getY());
        fireball.setRotation(getRotation());
        
        
    }
    public int point_to(int x, int y) 
    {
        int dx = x - getX(); 
        int dy = y - getY(); 
        double rotation = Math.atan2(dy, dx); 
        rotation = Math.toDegrees(rotation); 
        return (int)rotation; 
    }
    
}
