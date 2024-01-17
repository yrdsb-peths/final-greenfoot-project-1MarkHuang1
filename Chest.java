import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Chest  extends Actor
{
    private boolean pressed = false;
    GreenfootSound chestMusic = new GreenfootSound("chest.mp3");
    public Chest() {
        setImage("images/chest1.png");
        GreenfootImage image = getImage();
        chestMusic.setVolume(30);
        image.scale(58,37);
    }
    public void act()
    {
        //Change World when pressed
        if (isTouching(Player.class)&&Greenfoot.isKeyDown("f")){
            chestMusic.play();
            setImage("images/chest2.png");
            GreenfootImage image = getImage();
            image.scale(276/3,175/3);
        }
    }

}
