package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by StoRY_tellER on 1/5/2015.
 */
public class AssetLoader {
    public static TextureAtlas eiselTexture;
    public static Animation eiselWalk;
    public static Animation eiselIdle;

    public static void load(){
        eiselTexture = new TextureAtlas(Gdx.files.internal("data/eisel_spritesheet.atlas"));

        eiselWalk = new Animation(1/10f,
                (eiselTexture.findRegion("001")),
                (eiselTexture.findRegion("002")),
                (eiselTexture.findRegion("003")),
                (eiselTexture.findRegion("004")),
                (eiselTexture.findRegion("005")),
                (eiselTexture.findRegion("006")),
                (eiselTexture.findRegion("007")),
                (eiselTexture.findRegion("008")));
        eiselIdle = new Animation(1/10f,(eiselTexture.findRegion("idle")));
    }

    public static void dispose(){
        eiselTexture.dispose();
    }
}
