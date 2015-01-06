package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Color_Jump extends Game {

    MainScreen mainScreen;

    @Override
    public void create() {
        Gdx.app.log("Color Jump", "Created");
        mainScreen = new MainScreen();
        AssetLoader.load();
        setScreen(mainScreen);
    }

    @Override
    public void dispose() {
        super.dispose();
        AssetLoader.dispose();
    }
}
