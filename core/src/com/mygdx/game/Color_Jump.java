package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

import java.util.HashMap;
import java.util.Map;

public class Color_Jump extends Game implements ApplicationListener {
	private SpriteBatch batch;
	private TextureAtlas eiselTexture; //holds the information for Eisel's idle pose
    private Sprite eisel;           //the sprite for Eisel
    private Animation eiselWalk;
    private Animation eiselIdle;

    private float elapsedTime = 0;
    private int w,h;
	MainScreen mainScreen;
	@Override
	public void create () {
        Gdx.app.log("Color Jump", "Created");
		mainScreen = new MainScreen();
        setScreen(mainScreen);
		batch = new SpriteBatch();
		//eiselTexture = new TextureAtlas(Gdx.files.internal("data/eisel_idle.atlas"));
//        eiselTexture = new TextureAtlas(Gdx.files.internal("data/eisel_spritesheet.atlas"));
//        eiselWalk = new Animation(1/10f,
//                (eiselTexture.findRegion("0001")),
//                (eiselTexture.findRegion("0002")),
//                (eiselTexture.findRegion("0003")),
//                (eiselTexture.findRegion("0004")),
//                (eiselTexture.findRegion("0005")),
//                (eiselTexture.findRegion("0006")),
//                (eiselTexture.findRegion("0007")),
//                (eiselTexture.findRegion("0008")));
//        eiselIdle = new Animation(1/10f,(eiselTexture.findRegion("idle")));
        Gdx.app.log("Color Jump", "Animations set");
	}

    @Override
    public void dispose(){
        batch.dispose();
        eiselTexture.dispose();
    }

    @Override
    public void render () {
        Gdx.gl.glClearColor(1, 1, 1, 1);            //Clears the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
	    mainScreen.render(0);
        //elapsedTime+= Gdx.graphics.getDeltaTime();
        //batch.draw(eiselWalk.getKeyFrame(elapsedTime,true),0,0);

        batch.end();
    }

    @Override
    public void resize(int width, int height){

    }

    @Override
    public void pause(){

    }

    @Override public void resume(){

    }
}
