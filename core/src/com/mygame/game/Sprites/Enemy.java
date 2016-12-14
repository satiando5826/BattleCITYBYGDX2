package com.mygame.game.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.World;
import com.mygame.game.Screen.PlayScreen;

import javax.swing.*;

/**
 * Created by SatrarinSaejew on 12/14/2016 AD.
 */
public class Enemy extends Sprite {                                 //part16
    protected World world;
    protected PlayScreen screen;
    public Enemy(PlayScreen screen, float x, float y){
        this.world = screen.getWorld();
        this.screen = screen;
        setPosition(x,y);
    }
}
