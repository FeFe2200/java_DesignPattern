package strategypattrn3;

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;
    public static final int BASIC = 0;
    public static final int MAJOR = 1;

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score, boolean majorCode){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScorePoint(score);
        subject.setMajorCode(majorCode);
        subjectList.add(subject);
    }

    public void showGradeInfo() {
        for (int i = 0; i < subjectList.size(); i++) {
            Subject subject = subjectList.get(i);
            System.out.print("학생 " + studentName + "의 " + subject.getName() + "과목 성적은은 ");
            System.out.print(subject.getScorePoint() + "점 이고, 학점은 ");
            if (subject.isMajorCode())
                System.out.print(MajorGradeScore.gradeMarking(subject.getScorePoint()));
            else
                System.out.print(BasicGradeScore.gradeMarking(subject.getScorePoint()));
            System.out.println(" 입니다.");
        }
    }
}
