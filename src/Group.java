import java.io.Serializable;
import java.util.Arrays;
import java.util.Formatter;

public class Group implements Serializable, CallStudents {

    Student[] Group = new Student[10];
    private int i;
    private Professor prof;

    public Group() {
        i = 0;
    }

    public Professor getProf() {
        return prof;
    }

    public void setProf(Professor prof) {
        this.prof = prof;
    }

    public void addStudent(Student a) {
        try {
            if (i < Group.length) {
                Group[i] = a;
                i++;
            } else {
                throw new FullGroupException();
            }
        } catch (FullGroupException | NullPointerException e) {
            System.out.println("ATTENTION!!! This group is full");
        }
    }

    public String toString() {
        Formatter fr = new Formatter();
        int j = 0;
        fr.format("%-5s" + "%-10s" + "%-15s" + "%-15s" + "%-10s" + "%-7s" + "%-10s" + "%-15s" + "%-10s" + "%-15s" + "%-10s %n",
                "Num", "Name", "Middlename", "Lastname", "Age", "Sex", "VUZ", "Facult", "Point", "Willingness", "Experience");
        try {
            for (Student temp : Group)
                if (Group[j] != null) {
                    fr.format("%02d" + "%-3s" + "%-10s" + "%-15s" + "%-15s" + "%-10d" + "%-7c" + "%-10s" + "%-15s" + "%-10d" + "%-15s" + "%-10s %n",
                            (j + 1), ".", temp.getName(), temp.getMiddlename(), temp.getLastname(), temp.getAge(), temp.getSex(),
                            temp.getVuz(), temp.getFacult(), temp.getPoint(), temp.isWillingness(), temp.getExp());
                    j++;
                }
            String str = fr.toString();
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Group";
    }

    public void arraysort() {
        try {
            Arrays.sort(Group);
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        toString();
    }

    public void chooseElderGroup() {
        Formatter fr = new Formatter();
        fr.format("%-5s" + "%-10s" + "%-15s" + "%-15s" + "%-10s" + "%-7s" + "%-10s" + "%-15s" + "%-10s" + "%-15s" + "%-10s %n",
                "Num", "Name", "Middlename", "Lastname", "Age", "Sex", "VUZ", "Facult", "Point", "Willingness", "Experience");
        int max_point = Group[0].getPoint();
        try {
            for (int j = 0; j < Group.length; j++) {
                if ((Group[j].isWillingness()) && (max_point < Group[j].getPoint())) max_point = Group[j].getPoint();
            }
            System.out.println("Maximum point of the students of the group with willingness to be the eldergroup is " + max_point);
            System.out.println();
            System.out.println("Candidates for the eldergroup:");
            int count = 0;
            for (int j = 0; j < Group.length; j++) {
                if ((Group[j].getPoint() == max_point) && (Group[j].isWillingness())) {
                    fr.format("%02d" + "%-3s" + "%-10s" + "%-15s" + "%-15s" + "%-10d" + "%-7c" + "%-10s" + "%-15s" + "%-10d" + "%-15s" + "%-10s %n",
                            (count + 1), ".", Group[j].getName(), Group[j].getMiddlename(), Group[j].getLastname(), Group[j].getAge(), Group[j].getSex(),
                            Group[j].getVuz(), Group[j].getFacult(), Group[j].getPoint(), Group[j].isWillingness(), Group[j].getExp());
                    count++;
                }
            }
            String str = fr.toString();
            System.out.println(str);
            System.out.println("Total number of candidates for the eldergroup with maximum point and willingness: " + count);
            System.out.println();
            if (count > 1) {
                int max_exp = Group[0].getExp();
                for (int j = 0; j < Group.length; j++) {
                    if ((Group[j].getPoint() == max_point) && (Group[j].isWillingness()) && (max_exp < Group[j].getExp()))
                        max_exp = Group[j].getExp();
                }
                System.out.println("Maximum experience of the previous practice of the students (with maximum point and willingness to be the eldergroup) - " + max_exp + " month(-s)");
                System.out.println();
                System.out.println("The eldergroup is: ");
                Formatter fr1 = new Formatter();
                fr1.format("%-5s" + "%-10s" + "%-15s" + "%-15s" + "%-10s" + "%-7s" + "%-10s" + "%-15s" + "%-10s" + "%-15s" + "%-10s %n",
                        "Num", "Name", "Middlename", "Lastname", "Age", "Sex", "VUZ", "Facult", "Point", "Willingness", "Experience");
                for (int j = 0; j < Group.length; j++)
                    if ((Group[j].getPoint() == max_point) && (Group[j].getExp() == max_exp) && (Group[j].isWillingness()))
                        fr1.format("%02d" + "%-3s" + "%-10s" + "%-15s" + "%-15s" + "%-10d" + "%-7c" + "%-10s" + "%-15s" + "%-10d" + "%-15s" + "%-10s %n",
                                (01), ".", Group[j].getName(), Group[j].getMiddlename(), Group[j].getLastname(), Group[j].getAge(), Group[j].getSex(),
                                Group[j].getVuz(), Group[j].getFacult(), Group[j].getPoint(), Group[j].isWillingness(), Group[j].getExp());
                String str1 = fr1.toString();
                System.out.println(str1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void callStudents() {
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


