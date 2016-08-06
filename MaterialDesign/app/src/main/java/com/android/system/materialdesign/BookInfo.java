package com.android.system.materialdesign;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by cuihangchao on 2016/8/6 0006.
 */
public class BookInfo implements Serializable{
    private String name;
    private double price;
    private String outhor;
    private Drawable imageView;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOuthor() {
        return outhor;
    }

    public void setOuthor(String outhor) {
        this.outhor = outhor;
    }

    public Drawable getImageView() {
        return imageView;
    }

    public void setImageView(Drawable imageView) {
        this.imageView = imageView;
    }
}
