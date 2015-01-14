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

    private int height = 701;
    private int width = 150;

    private Rectangle boundingRect;

    public Eisel(float halfWidth, float screenHeight){
        position = new Vector2(halfWidth,screenHeight);
        velocity = new Vector2(0,0);
        boundingRect = new Rectangle();
    }

    public void update(float delta){
        if (isMoving() && InputHandler.activeTouch == 2){
            position.sub(velocity.cpy().scl(delta));
        }
        else //(isMoving())
        {  //move forward
            position.sub(velocity.cpy().scl(delta));
        }
    }

    public boolean isMoving(){
        boolean moving = (velocity.x > 0) || (velocity.x < 0);
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
        int Swidth = Gdx.graphics.getWidth();
        if (InputHandler.activeTouch == 2){
            velocity.y = 400;
        }
        else {
            if (cursorX < Swidth / 2) {
                velocity.x = 400;
            } else if (cursorX > Swidth / 2) {
                velocity.x = -400;
            }
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
