package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by StoRY_tellER on 1/4/2015.
 */
public class Eisel {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private int height = 701;
    private int width;

    public Eisel(float x, float y, int height, int width){
        this.height = height;
        this.width = width;
        position = new Vector2(x,y);
        velocity = new Vector2(0,0);
        acceleration = new Vector2(0,460);
    }

    public void update(float delta){
        velocity.add(acceleration.cpy().scl(delta));
        if (velocity.y > 200){
            velocity.y = 200;
        }
        position.add(velocity.cpy().scl(delta));
    }

    public boolean isMoving(){
        return (velocity.x > 0);
    }

    public void notClick(){
        velocity.x = 0;
    }
    public void onClick(){
        velocity.x += 40;
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
}
