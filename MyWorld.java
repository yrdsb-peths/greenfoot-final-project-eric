import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world the demon lives in.
 * 
 * @author Eric Zheng
 * @version June 2022
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel = new Label(0,30);
    SimpleTimer creepTimer = new SimpleTimer();
    public int time = 1500;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 

        Demon demon = new Demon();
        addObject(demon, 300, 200);
        Creep creep = new Creep();
        addObject(creep,400,100);

        scoreLabel = new Label("score: " + 0,30);
        addObject(scoreLabel,50,50);

    }

    public void act()
    {
        spawnCreep();
    }

    /**
     * increases score every kill
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue("score: " + score);
    }

    /**
     * creates a creep
     */

    public void createCreep()
    {

        Creep creep = new Creep();
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(300);
        addObject(creep,x,y) ;

    }

    /**
     * spawns creep faster and faster
     */

    public void spawnCreep()
    {
        if(creepTimer.millisElapsed()>time-(score*100))
        {

            createCreep();
            creepTimer.mark();

        }
    }

}
