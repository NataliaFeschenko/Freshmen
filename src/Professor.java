import java.io.Serializable;
import java.util.Formatter;

public class Professor extends Human implements Serializable, CallStudents {
    private String vuz;
    private String facult;
    private String subject;

    public Professor(String name, String middlename, String lastname, int age, char sex,
                     String vuz, String facult, String subject) {
        super(name, middlename, lastname, age, sex);
        this.vuz = vuz;
        this.facult = facult;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        super.toString();
        return ("VUZ: " + this.vuz + "Facult: " + this.facult + "Subject" + this.subject);
    }

    public void callStudents() {
        Student[] Group = new Student[10];
        Formatter fr2 = new Formatter();
        fr2.format("%-5s" + "%-10s" + "%-15s" + "%-15s" + "%-10s %n", "Num", "Name", "Middlename", "Lastname", "Presence");
        int i = 0;
        int count_present = 0;
        int count_absent = 0;
        try {
            for (int k = 0; k < Group.length; k++)
                if (Group[k].getPresence().equals("Present".toLowerCase())) {
                    fr2.format("%02d" + "%-3s" + "%-10s" + "%-15s" + "%-15s" + "%-10s %n", (i + 1), ".",
                            Group[k].getName(), Group[k].getMiddlename(), Group[k].getLastname(), Group[k].getPresence());
                    i++;
                    count_present++;
                } else {
                    fr2.format("%02d" + "%-3s" + "%-10s" + "%-15s" + "%-15s" + "%-10s %n", (i + 1), ".",
                            Group[k].getName(), Group[k].getMiddlename(), Group[k].getLastname(), Group[k].getPresence());
                    i++;
                    count_absent++;
                }
            String str2 = fr2.toString();
            System.out.println(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(count_present + " student(-s) is (-are) present, " + count_absent + " student(-s) is (-are) absent");
    }
}
