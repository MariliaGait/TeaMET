import java.util.Objects;

public class VolunteerAction {

    private int id;
    private String name;
    private String location;
    private String description;
    private String date;

    public VolunteerAction(String name, String location, String description,
        String date) {

        this.name = name;
        this.location = location;
        this.description = description;
        this.date = date;

    }

    public VolunteerAction(int id, String name, String location,
        String description, String date) {

        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.date = date;

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

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        VolunteerAction that = (VolunteerAction) o;

        return id == that.id && Objects.equals(name, that.name) &&
               Objects.equals(location, that.location) &&
               Objects.equals(description, that.description) &&
               Objects.equals(date, that.date);

    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, location, description, date);
    
    }

    @Override
    public String toString() {

        return "VolunteerAction{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", location='" + location + '\'' +
               ", description='" + description + '\'' +
               ", date='" + date + '\'' +
               '}';

    }

}