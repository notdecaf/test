package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;


/**
 * Created by StoRY_tellER on 1/3/2015.
 */
public class GameRenderer {
    private GameWorld world;
    private OrthographicCamera cam;
    private SpriteBatch batch;
    private ShapeRenderer shapeRenderer;
    private Eisel eisel;

    private Animation eiselIdle;
    private Animation eiselWalk;

    private int width = Gdx.graphics.getWidth();
    private int height = Gdx.graphics.getHeight();

    public GameRenderer(GameWorld world){
        this.world = world;
        cam = new OrthographicCamera();
        cam.setToOrtho(true,width*3/2,height*3/2);

        batch = new SpriteBatch();
        batch.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
        addAssets();
    }

    private void addAssets(){
        eisel = world.getEisel();
        eiselIdle = AssetLoader.eiselIdle;
        eiselWalk = AssetLoader.eiselWalk;
    }

    public void render(float runtime){
        Gdx.app.log("GameRenderer", "Render");

        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        shapeRenderer.begin(ShapeType.Filled);
        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0, 0, width*3/2, height*3/2);
        shapeRenderer.setColor(55 / 255.0f, 80 / 255.0f, 100 / 255.0f, 1);
        shapeRenderer.rect(0,0,width*3/2,100);
        shapeRenderer.setColor(111 / 255.0f, 186 / 255.0f, 45 / 255.0f, 1);
        shapeRenderer.rect(0,0,width*3/2,50);
        shapeRenderer.end();

        batch.begin();
        if (eisel.isMoving()){
            batch.draw(AssetLoader.eiselWalk.getKeyFrame(runtime,true),0,0);
        }
        else {
            batch.draw(AssetLoader.eiselIdle.getKeyFrame(runtime,true),0,0);
        }

        batch.end();
    }
}
