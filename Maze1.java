import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze1 extends World
{
    public static int sec =0;
    public static int min =0;
    SimpleTimer timer = new SimpleTimer();
    Player player;
    Label time;
    public Maze1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500,1); 
        Label Game = new Label("World1",20);
        addObject(Game,100,100);
        //time
        Label timeLabel = new Label("Time:",30);
        addObject(timeLabel,100,130);
        time = new Label(0,30);
        addObject(time,180,130);
        //mimic
        Mimic mimic = new Mimic();
        addObject(mimic,50,200);
        //player
        player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        prepare();
        
    }
    public void act(){
        if (Maze2.back == true){
            player.setLocation(340,484);
        }
        Maze2.back = false;
        time();
    }
    public void time(){
        if (timer.millisElapsed()>1000){
            sec++;
            time.setValue(min + ":" + sec);
            timer.mark();
        }
        if (sec == 60){
            sec = 0;
            min += 1;
            time.setValue(min + ":" + sec);
        }
    }
    private void prepare()
    {
        ////
        FinishButton finishButton = new FinishButton();
        addObject(finishButton,417,484);
        ////
        
        Walls walls = new Walls();
        addObject(walls,377,441);
        Walls walls2 = new Walls();
        addObject(walls2,425,440);
        Walls walls3 = new Walls();
        addObject(walls3,467,442);
        Walls walls4 = new Walls();
        addObject(walls4,464,478);
        Walls walls5 = new Walls();
        addObject(walls5,329,440);
        Walls walls6 = new Walls();
        addObject(walls6,285,439);
        Walls walls7 = new Walls();
        addObject(walls7,284,480);
        Walls walls8 = new Walls();
        addObject(walls8,507,22);

        Walls walls9 = new Walls();
        addObject(walls9,507,69);
        Walls walls10 = new Walls();
        addObject(walls10,506,116);
        Walls walls11 = new Walls();
        addObject(walls11,467,392);
        Walls walls12 = new Walls();
        addObject(walls12,511,392);

        Walls walls13 = new Walls();
        addObject(walls13,24,438);
        Walls walls14 = new Walls();
        addObject(walls14,74,436);
        Walls walls15 = new Walls();
        addObject(walls15,74,389);
        Walls walls16 = new Walls();
        addObject(walls16,178,435);
        Walls walls17 = new Walls();
        addObject(walls17,177,480);
        Walls walls18 = new Walls();
        addObject(walls18,177,383);
        Walls walls19 = new Walls();
        addObject(walls19,184,180);
        Walls walls20 = new Walls();
        addObject(walls20,234,178);
        Walls walls21 = new Walls();
        addObject(walls21,281,179);
        Walls walls22 = new Walls();
        addObject(walls22,329,180);
        Walls walls23 = new Walls();
        addObject(walls23,230,23);
        Walls walls24 = new Walls();
        addObject(walls24,230,71);
        Walls walls25 = new Walls();
        addObject(walls25,234,225);
        Walls walls26 = new Walls();
        addObject(walls26,234,275);
        Walls walls27 = new Walls();
        addObject(walls27,576,232);
        Walls walls28 = new Walls();
        addObject(walls28,528,232);
        Walls walls29 = new Walls();
        addObject(walls29,528,280);
        Walls walls30 = new Walls();
        addObject(walls30,477,231);
        Walls walls31 = new Walls();
        addObject(walls31,331,390);
        Walls walls32 = new Walls();
        addObject(walls32,329,339);
        Walls walls33 = new Walls();
        addObject(walls33,182,71);
        Walls walls34 = new Walls();
        addObject(walls34,22,81);
        Walls walls35 = new Walls();
        addObject(walls35,337,72);
        Walls walls36 = new Walls();
        addObject(walls36,371,72);
        Walls walls37 = new Walls();
        addObject(walls37,405,72);
        Walls walls38 = new Walls();
        addObject(walls38,21,246);
        Walls walls39 = new Walls();
        addObject(walls39,68,244);
        Walls walls40 = new Walls();
        addObject(walls40,374,179);
        Mimic mimic = new Mimic();
        addObject(mimic,568,28);
        Mimic mimic2 = new Mimic();
        addObject(mimic2,513,483);
        Mimic mimic3 = new Mimic();
        addObject(mimic3,510,453);
        Mimic mimic4 = new Mimic();
        addObject(mimic4,567,282);
        Mimic mimic5 = new Mimic();
        addObject(mimic5,548,453);
        Mimic mimic6 = new Mimic();
        addObject(mimic6,550,477);
        Mimic mimic7 = new Mimic();
        addObject(mimic7,26,482);
        Mimic mimic8 = new Mimic();
        addObject(mimic8,331,481);
        Mimic mimic9 = new Mimic();
        addObject(mimic9,370,482);
        Mimic mimic10 = new Mimic();
        addObject(mimic10,228,478);
        Mimic mimic11 = new Mimic();
        addObject(mimic11,287,385);
        Mimic mimic12 = new Mimic();
        addObject(mimic12,378,385);
        Mimic mimic13 = new Mimic();
        addObject(mimic13,409,387);
        Mimic mimic14 = new Mimic();
        addObject(mimic14,273,19);
        Mimic mimic15 = new Mimic();
        addObject(mimic15,457,13);
        Mimic mimic16 = new Mimic();
        addObject(mimic16,14,19);
        Mimic mimic17 = new Mimic();
        addObject(mimic17,177,15);
        Mimic mimic18 = new Mimic();
        addObject(mimic18,12,202);
        Mimic mimic19 = new Mimic();
        addObject(mimic19,22,385);
        Mimic mimic20 = new Mimic();
        addObject(mimic20,18,296);
        Mimic mimic21 = new Mimic();
        addObject(mimic21,190,226);
        Mimic mimic22 = new Mimic();
        addObject(mimic22,177,336);
        Mimic mimic23 = new Mimic();
        addObject(mimic23,123,475);
        Mimic mimic24 = new Mimic();
        addObject(mimic24,475,179);
        Mimic mimic25 = new Mimic();
        addObject(mimic25,224,117);
        
        
        ////
        Real1 real1 = new Real1();
        addObject(real1,359,23);
        ////
    }
}
