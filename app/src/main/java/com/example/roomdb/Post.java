package com.example.roomdb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "posts_table")
public class Post {
    @PrimaryKey(autoGenerate = true)
    private int id;
   
    private String title, body;
    private int userId;

    public Post(int userId, String title, String body) {

        this.userId = userId;
        this.title = title;
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
