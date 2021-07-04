package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {

        Course history = new Course("History", "101", "HTY");
        Course physics = new Course("Physics", "500", "PYC");
        Course chemistry = new Course("Chemistry", "205", "CMY");
        Course maths = new Course("Maths", "278", "MTH");
        Course turkish = new Course("Turkish", "453", "TRS");
        Course biology = new Course("Biology", "325", "BLY");

        Teacher teacher1 = new Teacher("Lale Basar", "5648975642", "HTY");
        Teacher teacher2 = new Teacher("Eda Yilmaz", "5879654321", "CMY");
        Teacher teacher3 = new Teacher("Ece Guler", "5548975612", "PYC");

        maths.addTeacher(teacher1);
        maths.printTeacher();

        physics.addTeacher(teacher2);
        physics.printTeacher();

        Student student1 = new Student("Ayla Dikmen", "478", "4", chemistry,physics, history);
        student1.addBulkExamNote(45,63,78,70,85,90);
        student1.isPass();

        Student student2 = new Student("Eda Ece", "4789", "3",maths,turkish,biology);
        student2.addBulkExamNote(80,65,74,68,78,85);
        student2.isPass();

    }
}
