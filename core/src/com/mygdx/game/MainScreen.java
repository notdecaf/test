package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * Created by StoRY_tellER on 1/3/2015.
 */
public class MainScreen implements Screen {
    GameWorld world;
    GameRenderer renderer;
    private float runtime = 0;

    public MainScreen(){
        Gdx.app.log("GameScreen", "Attached");

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = screenWidth;
        float gameHeight = screenHeight;

        world = new GameWorld((int)(gameWidth/2));
        renderer = new GameRenderer(world);
        Gdx.input.setInputProcessor(new InputHandler(world.getEisel()));
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "Show Called");
    }

    @Override
    public void render(float delta) {
        runtime += delta;
        world.update(delta);
        renderer.render(runtime);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "Resized");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "Pause Called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "Resume Called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "Hide Called");
    }

    @Override
    public void dispose() {

    }
}
