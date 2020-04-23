package com.example.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int NO_IMAGE_PROVIDED=-1;
    private int mAudioResourceId;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    public Word(String defaultTranslation,String miwokTranslation,int audioResourceId)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public Word(String defaultTranslation,String miwokTranslation,int ImageResourceId,int audioResourceId)
    {
        mImageResourceId=ImageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;
    }
    public String getmMiwokTranslation()
    {
       return mMiwokTranslation;
    }
    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public int getmImageResourceId()
    {
        return mImageResourceId;
    }
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getmAudioResourceIdt()
    {
        return mAudioResourceId;
    }
}
