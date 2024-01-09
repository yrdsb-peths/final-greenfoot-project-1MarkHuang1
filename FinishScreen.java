import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishScreen extends World
{

    
    public FinishScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label finish = new Label("Game Over",100);
        addObject(finish,getWidth()/2,100);
        Label timer = new Label("Time: ",40);
        addObject(timer, 200,200);
    }
}
