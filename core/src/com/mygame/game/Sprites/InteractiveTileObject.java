package com.mygame.game.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Created by Aspire on 8/12/2559.
 */
public class InteractiveTileObject {
    private World world;
    private TiledMap map;
    private TiledMapTile tile;
    private Rectangle bounds;

    private Body body;

    public  InteractiveTileObject(World world, TiledMap map, Rectangle bounds){
        this.world = world;
        this.map = map;
        this.bounds = bounds;
    }
}
