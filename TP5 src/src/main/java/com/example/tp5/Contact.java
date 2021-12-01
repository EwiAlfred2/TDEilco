package com.example.tp5;

public class Contact {
    public String Nom;
    public String Prenom;
    public String UrlImage;
    public Contact(String name, String surname)
    {
        this.Nom = name;
        this.Prenom = surname;
    }
    public Contact()
    {

    }

    public String getPrenom()
    {
        return this.Prenom;
    }
    public String getNom()
    {
        return this.Nom;
    }
}
