public class VolunteerAction {

    private int id;
    private String name;
    private String location;
    private String description;
    private String date;
    private String keywords;

    public VolunteerAction(String name, String location, String description,
        String date, String keywords) {

        this.name = name;
        this.location = location;
        this.description = description;
        this.date = date;
        this.keywords = keywords;

    }

    public VolunteerAction(int id, String name, String location,
        String description, String date, String keywords) {

        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.date = date;
        this.keywords = keywords;

    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getLocation() {

        return location;
    }

    public String getDescription() {

        return description;
    }

    public String getDate() {

        return date;
    }

    public String getKeywords() {

        return keywords;
    }

    @Override
    public String toString() {

        return "VolunteerAction{" +
               "id=" + id + '\'' +
               ", name='" + name + '\'' +
               ", location='" + location + '\'' +
               ", description='" + description + '\'' +
               ", date='" + date + '\'' +
               ", keywords='" + keywords + '\'' +
               "}";

    }

}
