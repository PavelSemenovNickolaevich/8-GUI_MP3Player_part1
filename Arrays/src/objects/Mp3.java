package objects;

public class Mp3 {
    @Override
    public String toString() {
        return "Mp3{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    String name;
    String path;


    public Mp3(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
