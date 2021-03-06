package com.ciuciu.camerax.controller.overlay;

import android.graphics.Rect;

public class Frame {

    private float left;
    private float right;
    private float top;
    private float bottom;

    public Frame(float left, float right, float top, float bottom) {
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
    }

    public Rect toRect() {
        return new Rect((int) left, (int) top, (int) right, (int) bottom);
    }

    public float getLeft() {
        return left;
    }

    public float getRight() {
        return right;
    }

    public float getTop() {
        return top;
    }

    public float getBottom() {
        return bottom;
    }

    public float getWidth() {
        return right - left;
    }

    public float getHeight() {
        return bottom - top;
    }
}
