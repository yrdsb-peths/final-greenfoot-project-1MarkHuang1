import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends World
{
    public Story()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        Label back = new Label("Press <b> to back",30);
        addObject (back,400,50);
    }
    public void act(){
         if (Greenfoot.isKeyDown("b")){
            TitleWorld titleWorld = new TitleWorld();
            Greenfoot.setWorld(titleWorld);
        }
    }
}
