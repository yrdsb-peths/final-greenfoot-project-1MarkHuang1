import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rule extends World
{

    /**
     * Constructor for objects of class Rule.
     * 
     */
    public Rule()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 480, 1); 
        Label back = new Label("Press <b> to back",40);
        addObject (back,300,50);
        
    }
    public void act(){
        //changes world
        if (Greenfoot.isKeyDown("b")){
            TitleWorld titleWorld = new TitleWorld();
            Greenfoot.setWorld(titleWorld);
        }
    }
}
