package com.example.trails.database;

public class User {
    public static final String TABLE_NAME = "user";
    public static final String COLUMN_ID = "user_id";
    public static final String COLUMN_NAME = "user_name";
    public static final String COLUMN_EMAIL = "user_email";
    public static final String COLUMN_DATE = "user_date";
    public static final String COLUMN_IMG = "user_img";


    private int id;
    private String name;
    private String email;
    private String date;
    private String image;


    public User() {
    }

    public User(int id, String name, String email, String date, String image) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.date = date;
        this.image = image;
    }

    public User(String name, String email, String date, String image) {
        this.name = name;
        this.email = email;
        this.date = date;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_NAME + " TEXT,"
                    + COLUMN_EMAIL + " TEXT,"
                    + COLUMN_DATE + " TEXT,"
                    + COLUMN_IMG + " TEXT,"
                    + ")";

    @Override
    public String toString() {
        return "Hike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                ", img='" + image +
                '}';
    }
}
