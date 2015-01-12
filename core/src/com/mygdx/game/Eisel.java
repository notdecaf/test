package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by StoRY_tellER on 1/4/2015.
 */
public class Eisel {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private int height = 701;
    private int width = 150;

    private Rectangle boundingRect;

    public Eisel(float halfWidth, float screenHeight){
        position = new Vector2(halfWidth,screenHeight);
        velocity = new Vector2(0,0);
        acceleration = new Vector2(200,0);
        boundingRect = new Rectangle();
    }

    public void update(float delta){
        if (isMoving()){
            velocity.add(acceleration.cpy().scl(delta));
            position.add(velocity.cpy().scl(delta));
        }

    }

    public boolean isMoving(){
        boolean moving = velocity.x > 0;
        if (moving){
            width = 382;
        }
        else {
            width = 150;
        }
        return moving;
    }

    public void notClick(){
        velocity.x = 0;
    }
    public void onClick(int cursorX){
        int width = Gdx.graphics.getWidth();
        if (cursorX < width/2){
            velocity.x = 200;
        }
        else if (cursorX > width/2){
            velocity.x = -200;
        }
    }

    public float getX(){
        return position.x;
    }

    public float getY(){
        return position.y;
    }

    public float getWidth(){
        return width;
    }

    public float getHeight(){
        return height;
    }

    public Vector2 getPosition() { return position; }

    public Rectangle getBoundingRect() {
        return boundingRect;
    }
}
