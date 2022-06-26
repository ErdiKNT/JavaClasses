package day44_Custom_Classes;

public class Song {

    String name;
    double length;
    String artist;
    String genre;

    public Song(String name) {
        this.name = name;
    }

    public Song(String name,double length){

//        this.name = name; This one was repeating, so we discard it and put this(name);
        this(name);
        this.length = length;
    }

    public Song(String name, double length, String artist) {
//        this.name = name;        Line 22 and 23 are repeating in this constructor, we can type this(method names)
//        this.length = length;
        this(name, length);
        this.artist = artist;
    }

    public Song(String name, double length, String artist, String genre) {
//        this.name = name;
//        this.length = length;
//        this.artist = artist;
        this(name, length, artist);
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
