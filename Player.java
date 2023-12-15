import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] walk = new GreenfootImage[3];    
    public Player(){
        for  (int i = 0; i< walk.length; i++){
            walk[i] = new GreenfootImage("images/char/char" + i + ".png");
            walk[i].scale(51,61);
        }
        setImage(walk[0]);
    }
    int imageIndex = 0;
    public void act()
    {
        if (Greenfoot.isKeyDown("a")){
            move(-5);
        }
        if(Greenfoot.isKeyDown("d") ){
            move(5);
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX() ,getY()-5);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX() ,getY()+5);
            setImage(walk[imageIndex]);
            imageIndex = (imageIndex + 1)% walk.length;
        }
        else{
            setImage(walk[0]);
        }
    }
}
