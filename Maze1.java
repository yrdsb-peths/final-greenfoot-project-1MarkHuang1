import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze1 extends World
{

    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500,1); 
        Label Game = new Label("Maze1",20);
        addObject(Game,100,100);
        FinishButton finishButton = new FinishButton();
        addObject(finishButton, 50, 300);
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
