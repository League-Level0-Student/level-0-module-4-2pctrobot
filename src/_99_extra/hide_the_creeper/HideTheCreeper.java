package _99_extra.hide_the_creeper;

import processing.core.PApplet;

public class HideTheCreeper extends PApplet {
    static final int WIDTH = 1920;
    static final int HEIGHT = 1080;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	PImage minecraft = loadImage("minecraft.png");
        minecraft.resize(WIDTH, HEIGHT);
        background(minecraft);
    }

    @Override
    public void draw() {
        
    }

    static public void main(String[] args) {
        PApplet.main(HideTheCreeper.class.getName());
    }
}
