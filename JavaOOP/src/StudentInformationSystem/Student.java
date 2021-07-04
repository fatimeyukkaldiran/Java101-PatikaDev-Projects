package StudentInformationSystem;
public class Student {
    String name;
    String studentNu;
    String classes;
    Course maths;
    Course chemistry;
    Course physics;
    double mathsVerbalEffectAverageRate = 0.40;
    double mathsNoteEffectAverageRate = 0.60;
    double physicsVerbalEffectAverageRate = 0.30;
    double physicsNoteEffectAverageRate = 0.70;
    double chemistryVerbalEffectAverageRate = 0.35;
    double chemistryNoteEffectAverageRate = 0.65;
    double average ;
    boolean isPass;

    public Student(String name, String studentNu, String classes, Course maths, Course physics, Course chemistry){
        this.name = name;
        this.studentNu = studentNu;
        this.classes = classes;
        this.maths = maths;
        this.chemistry = chemistry;
        this.physics = physics;

        this.isPass = false;
        calcAverage();

    }

    public void addBulkExamNote(int maths, int chemistry, int physics, int mathsVerbal, int physicsVerbal, int chemistryVerbal) {
        if (maths >= 0 && maths <= 100)
            this.maths.note = maths;
        this.maths.verbalNote = mathsVerbal;


        if (physics >= 0 && physics <= 100)
            this.physics.note = physics;
        this.physics.verbalNote = physicsVerbal;

        if (chemistry >= 0 && chemistry <= 100)
            this.chemistry.note = chemistry;
        this.chemistry.verbalNote = chemistryVerbal;
    }

    public void isPass(){
        if (this.maths.note == 0 || this.physics.note == 0 || this.chemistry.note == 0){
            System.out.println("Invalid notes");
        }else
            this.isPass = isCheckPass();
        printNote();
        System.out.println("Average : " + this.average);
        verbalNoteEffectsAverage();
        if (this.isPass)
            System.out.println("Classes passed.");
        else
            System.out.println("Remained in the classroom.");
    }
    public void calcAverage(){
        this.average = (this.maths.note + this.physics.note + this.chemistry.note)/3;
    }
    public void  printNote(){
        System.out.println("--------------------------------------");
        System.out.println("Student : " +this.name);
        System.out.println("Maths note : " +this.maths.note +" and "+ "verbal note : " + this.maths.verbalNote);
        System.out.println("Physics note : " + this.physics.note + " and " + "verbal note : " +this.physics.verbalNote);
        System.out.println("Chemistry note : " +this.chemistry.note + " and " + "verbal note : " +this.chemistry.verbalNote);
    }
    public  boolean isCheckPass(){
        calcAverage();
        return  this.average > 55;
    }

    public void verbalNoteEffectsAverage( ){
        double mathsGeneralEffectAverage = (this.maths.verbalNote*mathsVerbalEffectAverageRate) + (this.maths.note*mathsNoteEffectAverageRate);
        double physicsGeneralEffectAverage = (this.physics.verbalNote*physicsVerbalEffectAverageRate) + (this.physics.note*physicsNoteEffectAverageRate);
        double chemistryGeneralEffectAverage = (this.chemistry.verbalNote*chemistryVerbalEffectAverageRate) + (this.chemistry.note*chemistryNoteEffectAverageRate);
        System.out.println("Maths General Effect to Average : " +mathsGeneralEffectAverage);
        System.out.println("Physics General Effect to Average :" +physicsGeneralEffectAverage);
        System.out.println("Chemistry General Effect to Average :" +chemistryGeneralEffectAverage);

    }
}
