import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinishButton extends Actor
{

    SimpleTimer animationTimer;
    public boolean Pressed = false;
    public static int fMin;
    public static int fSec;
    public static boolean which = false;
    public FinishButton(){
        setImage("images/Finish1.png");
        GreenfootImage image = getImage();
        image.scale(20,20);
    }

    public void act()
    {
        //Change World when pressed
        animate();
        if (Pressed){
            animationTimer = new SimpleTimer();
            Pressed = false;
        }
        if(animationTimer != null){
            if(animationTimer.millisElapsed() > 120){
                fMin = Maze1.min;
                fSec = Maze1.sec;
                Player.health = 20;
                which = true;
                FinishScreen end = new FinishScreen();
                Greenfoot.setWorld(end);
            }
        }

    }
    //timing the press
    // animate on press
    public void animate(){
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f"))
        {
            Pressed = true;
            setImage("images/Finish2.png");
            GreenfootImage image = getImage();
            image.scale(20,20);
        }   
    }
}
