import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishScreen extends World
{   
    Label time;
    public FinishScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label finish = new Label("Game Over",100);
        addObject(finish,getWidth()/2,100);
        Label timer = new Label("Time Spent: ",40);
        addObject(timer, 200,200);
        String fTime = FinishButton.fMin + ":" + FinishButton.fSec;
        time = new Label(0,40);
        addObject(time,340,200);
        time.setValue(fTime);
        Label exit =new Label("Press <space> to return",40);
        addObject(exit,getWidth()/2,300);
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            TitleWorld titleWorld = new TitleWorld();
            Greenfoot.setWorld(titleWorld);
        }
    }
}
