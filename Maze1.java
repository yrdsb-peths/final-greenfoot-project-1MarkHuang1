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
        super(800, 500, 1,false); 
        Label Game = new Label("GameWOrld",10);
        addObject(Game,100,100);
        Player player = new Player();
        addObject(player, getWidth()/2, 200);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        BigWalls bigWalls = new BigWalls();
        addObject(bigWalls,780,183);
    }
}
