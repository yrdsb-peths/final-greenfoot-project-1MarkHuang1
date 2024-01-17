import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mimic2 extends Actor
{
    GreenfootSound faked = new GreenfootSound("faked.mp3");
    public Mimic2(){
        setImage("images/Fake1.png");
        GreenfootImage image = getImage();
        image.scale(20,20);
        faked.setVolume(30);
    }

    public void act()
    {
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f"))
        {
            faked.play();
            Maze2 maze2 = (Maze2) getWorld();
            maze2.removeObject(this);
        }   
    }

}
