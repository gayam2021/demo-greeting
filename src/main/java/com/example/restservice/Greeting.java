package com.example.restservice;

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {git remote add origin https://github.com/gayam2021/demo-greeting.git
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
