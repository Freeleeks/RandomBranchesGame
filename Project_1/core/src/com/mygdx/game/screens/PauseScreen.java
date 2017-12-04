package com.mygdx.game.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.mygdx.game.MainGame;

import static com.mygdx.game.MainGame.*;


public class PauseScreen implements Screen{
    private MainGame game;
    private OrthographicCamera camera;
    private Viewport viewport;
    private BitmapFont font;
    private Texture SaveGameButton;
    private Button startGame;
    private Stage stage;
    public PauseScreen(MainGame game){
        this.game = game;
       camera = new OrthographicCamera();
        viewport = new FitViewport(game.V_WIDTH, game.V_HEIGHT, camera);
        font = new BitmapFont();
        camera.position.set(viewport.getWorldWidth() / 2, viewport.getWorldHeight() / 2, 0);
        stage = new Stage(new ScreenViewport());
        Skin MenuButtons = new Skin(Gdx.files.internal("ButtonsMenu.json"));
        Button StartGame = new TextButton("Save Game", MenuButtons);
        StartGame.setSize(300, 100);
        StartGame.setPosition(550, 105);

        Button loadGame = new TextButton("Load Game", MenuButtons);
        loadGame.setSize(300, 100);
        loadGame.setPosition(550, 205);
    stage.addActor(StartGame);
    }

    @Override
    public void show() {

    }

    private void handleInput(float delta){
        if(Gdx.input.isKeyJustPressed(Input.Keys.P)){
            game.setScreen(MainGame.playScreen);
        }
    }

    private void update(float delta){
        handleInput(delta);
        camera.update();
    }

    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(1,1,1,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
