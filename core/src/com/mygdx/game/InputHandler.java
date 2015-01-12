package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;

/**
 * Created by StoRY_tellER on 1/5/2015.
 */
public class InputHandler implements InputProcessor{
    private Eisel eisel;
    int activeTouch = 0;

    public InputHandler(Eisel eisel){
        this.eisel = eisel;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            if (Gdx.app.getInput().isTouched(activeTouch)){
                activeTouch++;
                Gdx.app.log("InputHandler","activeTouch: " + activeTouch);
            }
        eisel.onClick();
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        activeTouch = 0;
        eisel.notClick();
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
