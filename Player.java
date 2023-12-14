import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    
    public Player(){
        GreenfootImage image = getImage();
        image.scale(51,61);
        setImage(image);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("a")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("d")){
            move(5);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX() ,getY()-5);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX() ,getY()+5);

        }
    }
}
