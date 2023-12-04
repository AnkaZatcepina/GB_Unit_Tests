package ru.anka.lesson3.hw;

public class User {

    String name;
    String password;

    boolean isAuthenticate = false;
    boolean isAdmin;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String name, String password) {
        if (this.name == name && this.password == password){
           this.isAuthenticate = true; 
           return true;
        }
        return false;
    }

    public void unlog() {
        this.isAuthenticate = false;
    }

    public boolean getIsAdmin() { return isAdmin; }

}