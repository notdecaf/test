package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by StoRY_tellER on 1/3/2015.
 */
public class GameWorld {

    private Eisel eisel;
    private Ball ball;

    public GameWorld(int midPointX){
        eisel = new Eisel(midPointX,Gdx.graphics.getHeight());
        ball = new Ball();
    }

    public void update(float delta){
        eisel.update(delta);
    }

    public Eisel getEisel(){
        return eisel;
    }
}
