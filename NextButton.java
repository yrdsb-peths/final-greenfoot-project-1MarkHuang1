import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NextButton extends Actor
{

    SimpleTimer animationTimer;
    public NextButton(){
        setImage("images/Next1.png");
        GreenfootImage image = getImage();
        image.scale(20,20);
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
                TitleWorld titleWorld = new TitleWorld();
                Greenfoot.setWorld(titleWorld);
            }
        }

    }
    // animate on press
    public void animate(){
        if (Greenfoot.mouseClicked(this))
        {
            setImage("images/Next2.png");
            GreenfootImage image = getImage();
            image.scale(20,20);
        }   
    }
}
