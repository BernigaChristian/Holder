package me.berniga;

/**
 * @author : Christian Berniga
 * @class : 4 D
 * @created : 18/01/2022, martedì
 **/
public class Cd {
    private String title;
    private String author;
    private int tracks;
    private int length;

    public Cd(String title, String author, int tracks, int length) {
        this.title = title;
        this.author = author;
        this.tracks = tracks;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public boolean compareLength(Cd c){
        return this.length==c.length;
    }

    public String toString(){
        return title+";"+author+";"+tracks+";"+length;
    }
}
