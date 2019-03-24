package oshin.tasnuva.firebase;

public class UserData {

    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public UserData() {
    }

    public UserData(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
