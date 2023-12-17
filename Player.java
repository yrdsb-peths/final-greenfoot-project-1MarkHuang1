import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    GreenfootImage[] walk = new GreenfootImage[3];    
    GreenfootImage[] right = new GreenfootImage[3];
    GreenfootImage[] left = new GreenfootImage[3];

    public Player(){
        for  (int i = 0; i< walk.length; i++){
            walk[i] = new GreenfootImage("images/front/char" + i + ".png");
            walk[i].scale(25,30);
        }
        for (int i = 0; i < right.length; i++){
            right[i] = new GreenfootImage("images/right/right" + i + ".png");
            right[i].scale(25,30);
        }
        for (int i = 0; i < left.length; i++){
            left[i] = new GreenfootImage("images/right/right" + i + ".png");
            left[i].mirrorHorizontally();
            left[i].scale(25,30);
        }
        setImage(walk[0]);
    }
    int imageIndex = 0;
    public void act()
    {
        if (Greenfoot.isKeyDown("a")){
            move(-3);
            setImage(left[imageIndex]);
            imageIndex = (imageIndex + 1)% left.length;
        }
        if(Greenfoot.isKeyDown("d") ){
            move(3);
            setImage(right[imageIndex]);
            imageIndex = (imageIndex + 1)% right.length;
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX() ,getY()-3);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX() ,getY()+3);
            setImage(walk[imageIndex]);
            imageIndex = (imageIndex + 1)% walk.length;
        }
        
    }
}
