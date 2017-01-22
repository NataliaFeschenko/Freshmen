import java.io.Serializable;

public class Human implements Comparable, Serializable {

    private String name;
    private String middlename;
    private String lastname;
    private int age;
    private char sex;

    public Human(String name, String middlename, String lastname, int age, char sex) {
        super();
        this.name = name;
        this.middlename = middlename;
        this.lastname = lastname;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return ("Name: " + this.name + "MiddleName: " + this.middlename + "LastName: " + this.lastname + "Age: " + this.age
                + " years old" + "Sex: " + sex);
    }

    @Override
    public int compareTo(Object lastname) {
        Human temp = (Human) lastname;
        return this.lastname.compareTo(temp.lastname);
    }
}