package com.mygdx.game.Screens;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class ShellClass extends Game{

    static public Skin gameSkin;
    public void create () {
        gameSkin = new Skin(Gdx.files.internal("ButtonsMenu.json"));
        this.setScreen(new StartMenu(this));
    }

    public void render () {
        super.render();
    }

    public void dispose () {
    }
}


