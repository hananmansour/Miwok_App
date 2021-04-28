package com.example.myfirstapp;

public class word {
    private String mmiowk;
    private String menglish;
    private int imageId = NO_IMAGE;
    private  static final int NO_IMAGE =-1;
    private int mAudioId;
     public word(){}
    public word(String miowkWord,String englishWord,int id,int AudioId){
        mmiowk=  miowkWord;
        menglish=englishWord;
imageId=id;
        mAudioId=AudioId;
    }

    public word(String miowkWord,String englishWord ,int AudioId){
        mmiowk=  miowkWord;
        menglish=englishWord;
        mAudioId=AudioId;

    }

    public String getMmiowk() {

        return mmiowk;
    }

    public String getMenglish() {

        return menglish;
    }

    public int getImageId()
    {
        return imageId;
    }
public boolean hasImage (){
    if (imageId!=NO_IMAGE )
        return true;
    else
        return false;

}

    public int getmAudioId() {
        return mAudioId;
    }
}
