
public class Main {
    public static void main (String [] args){
            Group group = new Group();
            Professor prof = new Professor("Oleg", "Ivanovich", "Petrenko",45, 'm',"KNU", "Radiofac", "Cybernetics");
            group.addStudent(new Student("Ivan", "Ivanovich", "Ivanov", 18, 'm', "KNU", "Radiofac", 76, true, 1, "present"));
            group.addStudent(new Student("Olga", "Petrovna", "Petrova", 20, 'f', "KNU", "Radiofac", 80, false, 2, "absent"));
            group.addStudent(new Student("Svetlana", "Ivanovna", "Petrova", 20, 'f', "KNU", "Radiofac", 86, true, 6, "present"));
            group.addStudent(new Student("Oksana", "Ivanovna", "Ivanova", 21, 'f', "KNU", "Radiofac", 90, false, 0, "absent"));
            group.addStudent(new Student("Petr", "Ivanovich", "Nikolaev", 21, 'm', "KNU", "Radiofac", 85, true, 1, "present"));
            group.addStudent(new Student("Irina", "Ivanovna", "Sidorova", 23, 'f', "KNU", "Radiofac", 70, true, 3, "present"));
            group.addStudent(new Student("Petr", "Ivanovich", "Vasechkin", 21, 'm', "KNU", "Radiofac", 92, true, 2, "present"));
            group.addStudent(new Student("Ivan", "Ivanovich", "Sidorov", 24, 'm', "KNU", "Radiofac", 92, true, 4, "present"));
            group.addStudent(new Student("Roman", "Ivanovich", "Romanov", 22, 'm', "KNU", "Radiofac", 88, true, 2, "absent"));
            group.addStudent(new Student("Oleg", "Ivanovich", "Sidorov", 21, 'm', "KNU", "Radiofac", 78, true, 1, "present"));
            System.out.println("Sorted students list:");
            group.arraysort();
            group.chooseElderGroup();
            group.callStudents();
        }
    }