package com.mygame.game.Sprites;

import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.mygame.game.BattleCITYbygdx;
import com.mygame.game.Screen.PlayScreen;

/**
 * Created by SatrarinSaejew on 12/14/2016 AD.
 */
public class AiTank extends Enemy {


    public AiTank(PlayScreen screen, float x, float y) {
        super(screen, x, y);
    }

    @Override
    protected void defineEnemy() {
        BodyDef bdef = new BodyDef();
        bdef.position.set(50 / BattleCITYbygdx.PPM,40/ BattleCITYbygdx.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);

        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(5.5f/BattleCITYbygdx.PPM);
        fdef.filter.categoryBits = BattleCITYbygdx.ENEMY_BIT;

        fdef.shape = shape;
        b2body.createFixture(fdef);
    }
}
