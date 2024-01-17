import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the title screen 
 * it has a play button, instruction buttons and a story button
 * Changes the world to another when pressed one of those buttons
 */
public class TitleWorld extends World
{
    //bg music
    public static GreenfootSound mazeMusic = new GreenfootSound("mazeMusic.mp3");
    // Title
    private boolean play = false;
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        StartButton startButton = new StartButton();
        addObject(startButton,getWidth()/2,190);
    }

    public void act(){
        if (Greenfoot.isKeyDown("e")){
            Rule rule = new Rule();
            Greenfoot.setWorld(rule);
        }
        if (!play){
            mazeMusic.playLoop();
            play = true;
        }
    }
}

