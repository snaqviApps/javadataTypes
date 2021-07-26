package abstracts;

import java.util.List;

public class Kane extends Wrestler implements IWrestler {

    private int size;
    private String description;

    public Kane(int size, String description) {
        this.size = size;
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String theMusic(String music) {
        System.out.println(this.getClass().getSimpleName()
                + " likes this music: " + music);
        return music;       // optional usable return value
    }

    @Override
    public void finisher() {
        System.out.println("very quick");
    }

    @Override
    public String IMusic(String music) {
        return null;
    }

    @Override
    public void I_finisher() {
        System.out.println(this.getClass().getSimpleName() + " makes very quick if listens: " + theMusic("ice_music"));
    }

    @Override
    public String toString() {
        return "Kane{" +
                "size=" + size +
                ", description='" + description + '\'' +
                '}';
    }


}
