import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class test extends World
{
    public static boolean real = false;
    public int changeNum;
    Player player;
    public test()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        Real1 real1 = new Real1();
        addObject(real1,359,23);
        Real1 real2 = new Real1();
        addObject(real2,200,23);
    }
    public void changeReal(){
        Real1 real1 = new Real1();
        Real1 real2 = new Real1();
    }
    public void act(){
        
    }
}
