import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleWorld extends World
{
    // Title
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
        StartButton playButton = new StartButton();
        addObject(playButton,getWidth()/2,190); 
    }
    public void prepare(){

    }
    public void act(){
        if (Greenfoot.isKeyDown("e")){
            Rule rule = new Rule();
            Greenfoot.setWorld(rule);
        }
        
    }
}

