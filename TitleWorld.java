import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
        // changes world
        if (Greenfoot.isKeyDown("e")){
            Rule rule = new Rule();
            Greenfoot.setWorld(rule);
        }
        if(Greenfoot.isKeyDown("r")){
            Story story = new Story();
            Greenfoot.setWorld(story);
        }
        // play music once world open and never stop
        if (!play){
            mazeMusic.playLoop();
            play = true;
        }
    }
}

