package miniproject2;

public class Contact {
    private String name;
    private String number;
    private String work;
    private String home;
    private String city;

    public Contact(String name, String number, String work, String home, String city) {
        this.name = name;
        this.number = number;
        this.work = work;
        this.home = home;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getWork() {
        return work;
    }

    public String getHome() {
        return home;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        String format;
        format = ". <" + name + "> (mobile=" + number;
        format = work.equals("")? format:format +", Work=" + work;
        format = home.equals("")? format:format +", Home=" + home;
        format = city.equals("")? format:format +", City=" + city;
        format = format + ")";
        return format;
    }
}