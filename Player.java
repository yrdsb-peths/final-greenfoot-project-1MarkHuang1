import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends Actor
{
    SimpleTimer animationTimer = new SimpleTimer();
    SimpleTimer hpLose = new SimpleTimer();
    GreenfootImage[] walk = new GreenfootImage[3];    
    GreenfootImage[] right = new GreenfootImage[3];
    GreenfootImage[] left = new GreenfootImage[3];
    GreenfootImage[] back = new GreenfootImage[3];
    public static int health = 20;
    public Player(){
        for  (int i = 0; i< walk.length; i++){
            walk[i] = new GreenfootImage("images/front/char" + i + ".png");
            walk[i].scale(25,30);
        }
        for (int i = 0; i < right.length; i++){
            right[i] = new GreenfootImage("images/side/right" + i + ".png");
            right[i].scale(25,30);
        }
        for (int i = 0; i < back.length; i++){
            back[i] = new GreenfootImage("images/back/back" + i + ".png");
            back[i].scale(25,30);
        }
        for (int i = 0; i < left.length; i++){
            left[i] = new GreenfootImage("images/side/right" + i + ".png");
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
            if (hitWalls()){
                move(+3);
            }
        }
        else{
            setImage(walk[0]);
        }
        if(Greenfoot.isKeyDown("d") ){
            move(3);
            setImage(right[imageIndex]);
            imageIndex = (imageIndex + 1)% right.length;
            if (hitWalls()){
                move(-3);
            }
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX() ,getY()-3);
            setImage(back[imageIndex]);
            imageIndex = (imageIndex + 1)% back.length;
            if (hitWalls()){
                setLocation(getX(),getY()+3);
            }
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX() ,getY()+3);
            setImage(walk[imageIndex]);
            imageIndex = (imageIndex + 1)% walk.length;
            if (hitWalls()){
                setLocation(getX(),getY()-3);
            }
        }
        hitSpike();
        hpSystem();
        dieEnding();
    }
    //check no hit walls
    public boolean hitWalls(){
        if (isTouching(Walls.class)){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hitSpike(){
        if (isTouching(Spike.class)){
            return true;
        }
        else{
            return false;
        }
    }
    public int hpSystem(){
        if(hitSpike()){
            if(hpLose.millisElapsed()>100){
                health = health-1;
                hpLose.mark();
            }
            
        }
        return health;
    }
    public void dieEnding(){
        if (health == 0){
            FinishButton.fMin = Maze1.min;
            FinishButton.fSec = Maze1.sec;
            FinishScreen end = new FinishScreen();
            Greenfoot.setWorld(end);
            health = 20;
        }
    }    
}
