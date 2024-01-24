import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * FinishScreen 
 *
 */
public class FinishScreen extends World
{   
    Label time;
    Label attempt; 
    //show if it happen
    Label showHappen;
    
    public static boolean change1 = false;
    public static boolean change2 = false;

    public FinishScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label finish = new Label("Game Over",100);
        addObject(finish,getWidth()/2,80);
        //time
        Label timer = new Label("Time Spent: ",40);
        addObject(timer, 200,150);
        //time number
        String fTime = FinishButton.fMin + ":" + FinishButton.fSec;
        time = new Label(0,40);
        addObject(time,340,150);
        time.setValue(fTime);
        //attempts 
        Label tries = new Label("Deaths: ",40);
        addObject(tries,200,200);
        attempt = new Label(0,40);
        attempt.setValue(Maze1.tries);
        addObject(attempt,340,200);
        //Change solution
        Label change = new Label("Press <R> to change current solution",30);
        addObject(change,getWidth()/2,300);
        //Show if solution changed
        showHappen = new Label("",30);
        addObject(showHappen,getWidth()/2,350);
        
        //
        Label exit =new Label("Press <space> to return",40);
        addObject(exit,getWidth()/2,250);
    }
    //change soultion of buttons
    public void changeSolution(){
        if (Greenfoot.isKeyDown("r")){
            change1 = true;
            showHappen.setValue("Solution Changed");
        }
    }
    public void act(){
        if (Greenfoot.isKeyDown("space")){
            //Changes music volume so music can be changed
            TitleWorld.mazeMusic.setVolume(80);
            Treasure.treasureMusic.setVolume(0);
            //Check if finishButton is pressed
            if(FinishButton.which){
                Maze1.tries = 0;
                FinishButton.which = false;
            }
            //set new world
            TitleWorld titleWorld = new TitleWorld();
            Greenfoot.setWorld(titleWorld);
            attempt.setValue(0);
        }
        changeSolution();
    }
}
