package entities;

public class employees {

    public employees(long id,String name,String workex) {
        super();
        this.id = id;
        this.name = name;
        this.workex = workex;
    }

    public employees() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private long id;

    @Override
    public String toString() {
        return "employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workex='" + workex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getWorkex() {
        return workex;
    }

    public void setWorkex(String workex) {
        this.workex = workex;
    }

    private String workex;
}
