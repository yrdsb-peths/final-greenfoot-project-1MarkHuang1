import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Real1 extends Actor
{

    SimpleTimer animationTimer;
    public boolean Pressed = false;
    public Real1(){
        setImage("images/Fake1.png");
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
                Maze2 maze2 = new Maze2();
                Greenfoot.setWorld(maze2);
            }
        }

    }
    //timing the press
    // animate on press
    public void animate(){
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f"))
        {
            Pressed = true;
            setImage("images/Fake2.png");
            GreenfootImage image = getImage();
            image.scale(20,20);
        }   
    }
}
