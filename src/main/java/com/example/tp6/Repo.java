package com.example.tp6;

public class Repo {


    private int id;
    //region ID get/set
    public int getID() {
        return this.id;
    }
    public void setID(int p_id) {
        try{
            this.id = p_id;}
        catch(Exception e){

        }
    }
    //endregion

    private String name;
    //region name get/set

    public String getName() {
        return this.name;
    }
    public void setName(String p_name) {
        try{
            this.name = p_name;}
        catch(Exception e){

        }
    }
    //endregion

    private String full_name;
    //region full name get/set

    public String getFName() {
        return this.full_name;
    }
    public void setFName(String p_Fname) {
        try{
            this.full_name = p_Fname;}
        catch(Exception e){

        }
    }
    //endregion

    private String html_url;
    //region url get/set

    public String getURL() {
        return this.html_url;
    }
    public void setURL(String p_URL) {
        try{
            this.html_url = p_URL;}
        catch(Exception e){

        }
    }
    //endregion

}
