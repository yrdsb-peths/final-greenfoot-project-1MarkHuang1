import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Treasure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Treasure extends World
{
    private boolean play = false;
    public static GreenfootSound treasureMusic = new GreenfootSound("treasureMusic.mp3");
    public Treasure()
    {    
        super(600, 400, 1); 
        prepare();
        Player player = new Player();
        addObject (player, getWidth()/2, 325);
        Label overScreen = new Label("Press <b> to go to finish screen",30);
        addObject(overScreen,getWidth()/2,100);
        Label openChest = new Label("Press <f> to open chest",30);
        addObject(openChest,getWidth()/2,200);
    }

    public void act(){
        if (Greenfoot.isKeyDown("b")){
            FinishScreen finishScreen = new FinishScreen();
            Greenfoot.setWorld(finishScreen);
        }
        if (!play){
            treasureMusic.playLoop();
            play = true;
        }
    }
    
    private void prepare()
    {
        Chest chest = new Chest();
        addObject(chest,500,333);
        GreenfootImage image = chest.getImage();
        image.mirrorHorizontally();
        Chest chest2 = new Chest();
        addObject(chest2,214,340);
        Chest chest3 = new Chest();
        addObject(chest3,76,342);
        Chest chest4 = new Chest();
        addObject(chest4,152,346);
        Chest chest5 = new Chest();
        addObject(chest5,427,340);
        Chest chest6 = new Chest();
        addObject(chest6,568,347);
        GreenfootImage image1 = chest5.getImage();
        image1.mirrorHorizontally();
        GreenfootImage image2 = chest6.getImage();
        image2.mirrorHorizontally();
    }
}
