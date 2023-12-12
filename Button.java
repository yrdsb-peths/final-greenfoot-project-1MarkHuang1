import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Button extends Actor
{
    private World link;
    public Button(String image, World link){
        setImage(new GreenfootImage(image));
        this.link = link;
    }
    public void act()
    {
        //Change World when pressed
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(this.link);
        }
    
    }
}
