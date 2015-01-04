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

    public MainScreen(){
        Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "Show Called");
    }

    @Override
    public void render(float delta) {
        world.update(delta);
        renderer.render();
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
