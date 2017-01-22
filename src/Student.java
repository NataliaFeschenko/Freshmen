
import java.io.Serializable;

public class Student extends Human implements Serializable {
    private String vuz;
    private String facult;
    private int point;
    private boolean willingness;
    private int exp;
    private String presence;

    public Student(String name, String middlename, String lastname, int age, char sex,
                   String vuz, String facult, int point, boolean willingness, int exp, String presence) {
        super(name, middlename, lastname, age, sex);
        this.vuz = vuz;
        this.facult = facult;
        this.point = point;
        this.willingness = willingness;
        this.exp = exp;
        this.presence = presence;
    }

    public String getVuz() {
        return vuz;
    }

    public void setVuz(String vuz) {
        this.vuz = vuz;
    }

    public String getFacult() {
        return facult;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public boolean isWillingness() {
        return willingness;
    }

    public void setWillingness(boolean willingness) {
        this.willingness = willingness;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    @Override
    public String toString() {
        super.toString();
        return ("VUZ: " + this.vuz + "Facult: " + this.facult + "Point: " + this.point + "Willingness" + this.willingness + "Experience" + exp + "Presence" + presence);
    }
}

