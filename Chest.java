import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Chest  extends Actor
{
    private boolean pressed = false;
    public Chest() {
        setImage("images/chest1.png");
        GreenfootImage image = getImage();
        image.scale(58,37);
    }
    public void act()
    {
        //Change World when pressed
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f")){
            setImage("images/chest2.png");
            GreenfootImage image = getImage();
            image.scale(276/3,175/3);
        }
    }

}
