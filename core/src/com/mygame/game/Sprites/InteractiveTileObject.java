package com.mygame.game.Sprites;

import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapTile;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.*;
import com.mygame.game.BattleCITYbygdx;
import com.mygame.game.Screen.PlayScreen;

/**
 * Created by Aspire on 8/12/2559.
 */
public abstract class InteractiveTileObject {
    protected World world;
    protected TiledMap map;
    protected TiledMapTile tile;
    protected Rectangle bounds;
    protected Fixture fixture;

    private Body body;

    public  InteractiveTileObject(PlayScreen screen, Rectangle bounds){
        this.world = screen.getWorld();
        this.map = screen.getMap();
        this.bounds = bounds;

        BodyDef bdef = new BodyDef();
        FixtureDef fdef = new FixtureDef();
        PolygonShape shape = new PolygonShape();

        bdef.type = BodyDef.BodyType.StaticBody;
        bdef.position.set((bounds.getX() + bounds.getWidth()/2)/ BattleCITYbygdx.PPM, (bounds.getY() + bounds.getHeight()/2)/BattleCITYbygdx.PPM);

        body = world.createBody(bdef);

        shape.setAsBox((bounds.getWidth()/2)/BattleCITYbygdx.PPM,(bounds.getHeight()/2)/BattleCITYbygdx.PPM);
        fdef.shape = shape;
        fixture = body.createFixture(fdef);
    }
    public abstract void onBullethit();
    public void setCategoryFilter(short filterBit){
        Filter filter = new Filter();
        filter.categoryBits = filterBit;
        fixture.setFilterData(filter);
    }


}
