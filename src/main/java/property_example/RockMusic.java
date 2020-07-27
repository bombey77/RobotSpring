package property_example;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RockMusic implements Music {

    @Value("${song.name}")
    private String name;
    @Value("${song.album}")
    private String album;

    public RockMusic() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    @Override
    public void play() {
        System.out.println(name + " from " + album + " is playing...");
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("init");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("destroy");
    }
}
