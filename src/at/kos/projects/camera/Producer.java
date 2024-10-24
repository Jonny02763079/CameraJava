package at.kos.projects.camera;

public class Producer {

    private String name;

    private String country;

    public Producer(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

}
