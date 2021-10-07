package entity;

import jakarta.persistence.*;

@Table(name = "songs")
@Entity
public class Song {
    @Id
    @Column(name = "idsongs", nullable = false)
    private Integer id;

    @Column(name = "artist", nullable = false, length = 45)
    private String artist;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "album", nullable = false, length = 45)
    private String album;

    @Column(name = "single", nullable = false, length = 45)
    private String single;

    public Song() {
    }

    public Song(Integer id, String artist, Integer year, String album, String single, User createBy) {
        this.id = id;
        this.artist = artist;
        this.year = year;
        this.album = album;
        this.single = single;
        this.createBy = createBy;
    }

    @ManyToOne
    @JoinColumn(name = "create_by")
    private User createBy;

    public User getCreateBy() {
        return createBy;
    }

    public void setCreateBy(User createBy) {
        this.createBy = createBy;
    }

    public String getSingle() {
        return single;
    }

    public void setSingle(String single) {
        this.single = single;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}