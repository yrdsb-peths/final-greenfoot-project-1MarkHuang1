import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends World
{
    public Treasure()
    {    
        super(600, 400, 1); 
        Player player = new Player();
        addObject (player, getWidth()/2, getHeight()/2);
        Label overScreen = new Label("Press <b> to go to finish screen",30);
        addObject(overScreen,getWidth()/2,100);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("b")){
            FinishScreen finishScreen = new FinishScreen();
            Greenfoot.setWorld(finishScreen);
        }
    }
}
