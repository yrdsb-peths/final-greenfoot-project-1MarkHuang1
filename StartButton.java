import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class StartButton extends Actor
{
    private World link;
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
            if(animationTimer.millisElapsed() > 100){
                GameWorld gameWorld = new GameWorld();
                Greenfoot.setWorld(gameWorld);
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
