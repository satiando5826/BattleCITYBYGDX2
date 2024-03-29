package com.mygame.game.Tool;

import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.*;
import com.mygame.game.BattleCITYbygdx;
import com.mygame.game.Screen.PlayScreen;
import com.mygame.game.Sprites.Brick;
import com.mygame.game.Sprites.metal;



/**
 * Created by Aspire on 8/12/2559.
 */
public class B2WorldCreator {
    public B2WorldCreator(PlayScreen screen){
        World world = screen.getWorld();
        TiledMap map = screen.getMap();

        BodyDef bdef = new BodyDef();
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();
        Body body;

        //Metal wall
        for(MapObject object : map.getLayers().get(6).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

           new metal(screen ,rect);
        }


        //forest
        for(MapObject object : map.getLayers().get(6).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set((rect.getX() + rect.getWidth()/2)/ BattleCITYbygdx.PPM, (rect.getY() + rect.getHeight()/2)/BattleCITYbygdx.PPM);

            body = world.createBody(bdef);

            shape.setAsBox((rect.getWidth()/2)/BattleCITYbygdx.PPM,(rect.getHeight()/2)/BattleCITYbygdx.PPM);
            fdef.shape = shape;
            body.createFixture(fdef);
        }

        //water
        for(MapObject object : map.getLayers().get(7).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set((rect.getX() + rect.getWidth()/2)/ BattleCITYbygdx.PPM, (rect.getY() + rect.getHeight()/2)/BattleCITYbygdx.PPM);

            body = world.createBody(bdef);

            shape.setAsBox((rect.getWidth()/2)/BattleCITYbygdx.PPM,(rect.getHeight()/2)/BattleCITYbygdx.PPM);
            fdef.shape = shape;
            body.createFixture(fdef);
        }

        //Base
        for(MapObject object : map.getLayers().get(10).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set((rect.getX() + rect.getWidth()/2)/ BattleCITYbygdx.PPM, (rect.getY() + rect.getHeight()/2)/BattleCITYbygdx.PPM);

            body = world.createBody(bdef);

            shape.setAsBox((rect.getWidth()/2)/BattleCITYbygdx.PPM,(rect.getHeight()/2)/BattleCITYbygdx.PPM);
            fdef.shape = shape;
            body.createFixture(fdef);
        }

        //Brick
        for(MapObject object : map.getLayers().get(9).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            new Brick(screen ,rect);
        }

     //   Stage frame
        for(MapObject object : map.getLayers().get(11).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();

            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set(rect.getX() + rect.getWidth()/2/BattleCITYbygdx.PPM, rect.getY() + rect.getHeight()/2/BattleCITYbygdx.PPM);

            body = world.createBody(bdef);

            shape.setAsBox(rect.getWidth()/2/BattleCITYbygdx.PPM,rect.getHeight()/2/BattleCITYbygdx.PPM);
            fdef.shape = shape;
            body.createFixture(fdef);
        }
    }
}
