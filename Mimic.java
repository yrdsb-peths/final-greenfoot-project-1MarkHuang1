import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mimic extends Actor
{
    GreenfootSound faked = new GreenfootSound("faked.mp3");
    public Mimic(){
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
            Maze1 maze1 = (Maze1) getWorld();
            maze1.removeObject(this);
        }   
    }

}
