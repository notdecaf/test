package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Vector2;

import java.util.Random;

/**
 * Created by StoRY_tellER on 1/11/2015.
 */
public class Ball {

    private int width = 200;
    private int height = 200;
    private Vector2 velocity;
    private Vector2 position;

    private Circle circle;
    Random r = new Random();

    public Ball(){
        int x = r.nextInt(Gdx.graphics.getWidth());
        int xVel = r.nextInt(Gdx.graphics.getWidth()/4);
        circle = new Circle(x, Gdx.graphics.getHeight(),(width/2));
        velocity = new Vector2(xVel,0);
        position = new Vector2();
    }

    public void update(float delta){
        position.sub(velocity.cpy().scl(delta));
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public Vector2 getPosition(){
        return position;
    }
}
