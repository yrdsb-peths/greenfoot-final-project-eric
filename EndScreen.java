import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The endscreen when the game ends.
 * 
 * @author Eric Zheng 
 * @version June 2022
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class EndScreen.
     * 
     */
    public EndScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label gameOverr = new Label("Game Over",70);
        Label ggwp = new Label("ggwp",60);
        Label died = new Label("You Died",60);
        addObject(gameOverr,300,200);
        addObject(ggwp,300,300);
        addObject(died,300,100);
    }
}
