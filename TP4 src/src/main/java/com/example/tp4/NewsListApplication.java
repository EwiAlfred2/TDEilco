package com.example.tp4;

public class NewsListApplication extends android.app.Application {

    String login;

    @Override
    public void onCreate() {
        super.onCreate();
        this.login = null;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
