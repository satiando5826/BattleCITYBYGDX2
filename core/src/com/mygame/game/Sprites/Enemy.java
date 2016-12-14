package com.mygame.game.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;
import com.mygame.game.Screen.PlayScreen;

import javax.swing.*;

/**
 * Created by SatrarinSaejew on 12/14/2016 AD.
 */
public abstract class Enemy extends Sprite {                                 //part16
    protected World world;
    protected PlayScreen screen;
    public Body b2body;




    public Enemy(PlayScreen screen, float x, float y){
        this.world = screen.getWorld();
        this.screen = screen;
        setPosition(x,y);
    }
    protected abstract void defineEnemy();


}
