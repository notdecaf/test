package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by StoRY_tellER on 1/3/2015.
 */
public class GameWorld {

    private Rectangle rect = new Rectangle(0,0,500,700);

    public void update(float delta){
        Gdx.app.log("GameWorld", "update");
        Gdx.app.log("GameWorld","Width:" + Gdx.graphics.getWidth());
        Gdx.app.log("GameWorld","Height:" + Gdx.graphics.getHeight());
        rect.x++;
        if (rect.x > Gdx.graphics.getWidth()){
            Gdx.app.log("GameWorld","Moved");
            rect.x = 0;
        }
    }

    public Rectangle getRect(){
        return rect;
    }
}
