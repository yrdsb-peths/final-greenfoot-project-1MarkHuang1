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
    Label attempt; 
    public FinishScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label finish = new Label("Game Over",100);
        addObject(finish,getWidth()/2,100);
        //time
        Label timer = new Label("Time Spent: ",40);
        addObject(timer, 200,200);
        //time number
        String fTime = FinishButton.fMin + ":" + FinishButton.fSec;
        time = new Label(0,40);
        addObject(time,340,200);
        time.setValue(fTime);
        //attempts 
        Label tries = new Label("Deaths: ",40);
        addObject(tries,200,260);
        attempt = new Label(0,40);
        attempt.setValue(Maze1.tries);
        addObject(attempt,340,260);
        
        Label exit =new Label("Press <space> to return",40);
        addObject(exit,getWidth()/2,350);
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            if(FinishButton.which == true){
                Maze1.tries = 0;
                FinishButton.which = false;
            }
            TitleWorld titleWorld = new TitleWorld();
            Greenfoot.setWorld(titleWorld);
            attempt.setValue(0);
        }
    }
}
