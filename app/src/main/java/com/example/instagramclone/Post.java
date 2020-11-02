package com.example.instagramclone;

import android.util.Log;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import org.parceler.Parcel;


@Parcel(analyze = Post.class)
@ParseClassName("Post")
public class Post extends ParseObject {

    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED_AT = "createdAt";
    public String formattedTime;

    //needed for Parcel
    public Post() { }

    public String getDescription() {
        return getString(KEY_DESCRIPTION);
    }
    public void setDescription(String description) {
        put(KEY_DESCRIPTION, description);
    }

    public String getKeyCreatedAt() {
        return getString(KEY_CREATED_AT);
    }
    public void setKeyCreatedAt(String createdAt) {
        put(KEY_CREATED_AT, createdAt);
    }

    public ParseFile getImage() {
        return  getParseFile(KEY_IMAGE);
    }
    public void setImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getUser() {
        return getParseUser(KEY_USER);
    }
    public void setUser(ParseUser user) {
        put(KEY_USER, user);
    }

//    public String getFormattedTimestamp() {
//        formattedTime = TimeFormatter.getTimeDifference(getKeyCreatedAt());
//        return formattedTime;
//    }

}
