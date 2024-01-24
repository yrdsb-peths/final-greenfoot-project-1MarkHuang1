import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinishButton extends Actor
{
    GreenfootSound realSound = new GreenfootSound("real.mp3");
    SimpleTimer animationTimer;
    public boolean pressed = false;
    public static int fMin;
    public static int fSec;
    public static boolean which = false;
    //constructer
    public FinishButton(){
        setImage("images/Finish1.png");
        GreenfootImage image = getImage();
        image.scale(20,20);
    }
    public void act()
    {
        //Change World when pressed
        animate();
        // check if button is pressed
        if (pressed){
            animationTimer = new SimpleTimer();
            pressed = false;
        }
        if(animationTimer != null){
            if(animationTimer.millisElapsed() > 120){
                fMin = Maze1.min;
                fSec = Maze1.sec;
                Player.health = 20;
                which = true;
                Treasure treasure = new Treasure();
                Greenfoot.setWorld(treasure);
            }
        }

    }
    //timing the press
    // animate on press
    public void animate(){
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f"))
        {
            //changes music 
            TitleWorld.mazeMusic.setVolume(0);
            Treasure.treasureMusic.setVolume(80);
            pressed = true;
            // play press sound
            realSound.play();
            // change image
            setImage("images/Finish2.png");
            GreenfootImage image = getImage();
            image.scale(20,20);
        }   
    }
}
