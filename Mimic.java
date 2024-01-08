import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mimic extends Actor
{
    public Mimic(){
        setImage("images/Fake1.png");
        GreenfootImage image = getImage();
        image.scale(20,20);
        
    }

    public void act()
    {
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f"))
        {
           Maze1 maze1 = (Maze1) getWorld();
           maze1.removeObject(this);
        }   
    }

}
