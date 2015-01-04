package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * Created by StoRY_tellER on 1/3/2015.
 */
public class GameRenderer {
    private GameWorld world;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld world){
        this.world = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render(){
        Gdx.app.log("GameRenderer", "Render");

        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(world.getRect().x, world.getRect().y,world.getRect().getWidth(),world.getRect().getHeight());
        shapeRenderer.end();

        shapeRenderer.begin(ShapeType.Line);
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);
        shapeRenderer.rect(world.getRect().x, world.getRect().y,world.getRect().getWidth(),world.getRect().getHeight());
        shapeRenderer.end();
    }
}
