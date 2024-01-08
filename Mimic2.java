import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Mimic2 extends Actor
{
    public Mimic2(){
        setImage("images/Fake1.png");
        GreenfootImage image = getImage();
        image.scale(20,20);
        
    }

    public void act()
    {
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f"))
        {
           Maze2 maze2 = (Maze2) getWorld();
           maze2.removeObject(this);
        }   
    }

}
