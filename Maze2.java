import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Maze2 extends World
{
    public static boolean back = false;
    public Maze2()
    {    
        super(600, 500, 1); 
        Label Game = new Label("Maze2",20);
        addObject(Game,100,100);

        
        ////
        Player player = new Player();
        addObject(player, getWidth()/2, getHeight()/2);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ///
        Real2 real2 = new Real2();
        addObject(real2,100,403);
        ///
        
        Walls walls = new Walls();
        addObject(walls,297,194);
        Walls walls2 = new Walls();
        addObject(walls2,343,193);
        Walls walls3 = new Walls();
        addObject(walls3,386,193);
        Walls walls4 = new Walls();
        addObject(walls4,387,239);
        Walls walls5 = new Walls();
        addObject(walls5,576,69);
        Walls walls6 = new Walls();
        addObject(walls6,530,68);
        Walls walls7 = new Walls();
        addObject(walls7,483,67);
        Walls walls8 = new Walls();
        addObject(walls8,532,114);
        Walls walls9 = new Walls();
        addObject(walls9,383,148);
        Walls walls10 = new Walls();
        addObject(walls10,530,208);
        Walls walls11 = new Walls();
        addObject(walls11,530,253);
        Walls walls12 = new Walls();
        addObject(walls12,575,251);
        Walls walls13 = new Walls();
        addObject(walls13,388,371);
        Walls walls14 = new Walls();
        addObject(walls14,435,369);
        Walls walls15 = new Walls();
        addObject(walls15,479,369);
        Walls walls16 = new Walls();
        addObject(walls16,527,369);
        Walls walls17 = new Walls();
        addObject(walls17,573,367);
        Walls walls18 = new Walls();
        addObject(walls18,486,416);
        walls18.setLocation(485,435);
        Walls walls19 = new Walls();
        addObject(walls19,485,435);
        Walls walls20 = new Walls();
        addObject(walls20,192,267);
        Walls walls21 = new Walls();
        addObject(walls21,193,310);
        Walls walls22 = new Walls();
        addObject(walls22,240,310);
        Walls walls23 = new Walls();
        addObject(walls23,147,358);
        Walls walls24 = new Walls();
        addObject(walls24,96,357);
        Walls walls25 = new Walls();
        addObject(walls25,148,405);
        Walls walls26 = new Walls();
        addObject(walls26,148,435);
        Walls walls27 = new Walls();
        addObject(walls27,145,479);
        Walls walls28 = new Walls();
        addObject(walls28,269,414);
        Walls walls29 = new Walls();
        addObject(walls29,267,459);
        walls29.setLocation(267,479);
        Walls walls30 = new Walls();
        addObject(walls30,267,479);
        Walls walls31 = new Walls();
        addObject(walls31,309,482);
        Walls walls32 = new Walls();
        addObject(walls32,24,474);
        Walls walls33 = new Walls();
        addObject(walls33,24,211);
        Walls walls34 = new Walls();
        addObject(walls34,71,210);
        Walls walls35 = new Walls();
        addObject(walls35,106,209);
        removeObject(walls35);
        addObject(walls35,184,21);
        Walls walls36 = new Walls();
        addObject(walls36,185,70);
        Walls walls37 = new Walls();
        addObject(walls37,381,23);
        Walls walls38 = new Walls();
        addObject(walls38,234,69);
        Walls walls39 = new Walls();
        addObject(walls39,182,117);
        Walls walls40 = new Walls();
        addObject(walls40,72,23);
        Walls walls41 = new Walls();
        addObject(walls41,576,415);
        Walls walls42 = new Walls();
        addObject(walls42,265,442);
        Walls walls43 = new Walls();
        addObject(walls43,486,399);
        Mimic2 mimic2 = new Mimic2();
        addObject(mimic2,22,31);
        Mimic2 mimic22 = new Mimic2();
        addObject(mimic22,580,23);
        Mimic2 mimic23 = new Mimic2();
        addObject(mimic23,578,119);
        Mimic2 mimic24 = new Mimic2();
        addObject(mimic24,578,207);
        Mimic2 mimic25 = new Mimic2();
        addObject(mimic25,575,299);
        Mimic2 mimic26 = new Mimic2();
        addObject(mimic26,532,299);
        Mimic2 mimic27 = new Mimic2();
        addObject(mimic27,435,230);
        Mimic2 mimic28 = new Mimic2();
        addObject(mimic28,433,145);
        Mimic2 mimic29 = new Mimic2();
        addObject(mimic29,231,21);
        Mimic2 mimic210 = new Mimic2();
        addObject(mimic210,234,108);
        Mimic2 mimic211 = new Mimic2();
        addObject(mimic211,131,23);
        Mimic2 mimic212 = new Mimic2();
        addObject(mimic212,126,200);
        Mimic2 mimic213 = new Mimic2();
        addObject(mimic213,142,319);
        Mimic2 mimic214 = new Mimic2();
        addObject(mimic214,79,474);
        Mimic2 mimic215 = new Mimic2();
        addObject(mimic215,13,430);
        Mimic2 mimic216 = new Mimic2();
        addObject(mimic216,185,467);
        Mimic2 mimic217 = new Mimic2();
        addObject(mimic217,194,422);
        Mimic2 mimic218 = new Mimic2();
        addObject(mimic218,192,371);
        Mimic2 mimic219 = new Mimic2();
        addObject(mimic219,317,440);
        Mimic2 mimic220 = new Mimic2();
        addObject(mimic220,362,478);
        Mimic2 mimic221 = new Mimic2();
        addObject(mimic221,433,429);
        Mimic2 mimic222 = new Mimic2();
        addObject(mimic222,528,420);
        Mimic2 mimic223 = new Mimic2();
        addObject(mimic223,578,476);
        Mimic2 mimic224 = new Mimic2();
        addObject(mimic224,20,258);
        Mimic2 mimic225 = new Mimic2();
        addObject(mimic225,23,168);
        Mimic2 mimic226 = new Mimic2();
        addObject(mimic226,326,139);
        
    }
}
