import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class StartButton extends Actor
{
    SimpleTimer animationTimer;
    public void StartButton(){
        setImage("images/Start1.png");
    }
    public void act()
    {
        //Change World when pressed
        animate();
        if (Greenfoot.mouseClicked(this)){
            animationTimer = new SimpleTimer();
        }
        if(animationTimer != null){
            if(animationTimer.millisElapsed() > 120){
                Maze1.min = 0;
                Maze1.sec = 0;
                Maze1 maze1 = new Maze1();
                Greenfoot.setWorld(maze1);
            }
        }
    
    }
    // animate on press
    public void animate(){
        if (Greenfoot.mouseClicked(this))
        {
            setImage("images/Start2.png");
        }   
    }
   
}
