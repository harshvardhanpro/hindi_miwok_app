package com.example.android.miwok;

/**
 * Created by Harsh on 12/25/2016.
 */

public class Word1 {

   private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgRId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word1(String m,String d,int i){
        mMiwokTranslation=m;
        mDefaultTranslation=d;
        mImgRId=i;
    }

    public Word1(String m,String d){
        mMiwokTranslation=m;
        mDefaultTranslation=d;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImgRId() { return mImgRId; }
    public boolean hasImage(){return mImgRId!=NO_IMAGE_PROVIDED;}
}
