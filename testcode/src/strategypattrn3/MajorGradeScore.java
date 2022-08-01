package strategypattrn3;

public class MajorGradeScore implements GradeScore {
    private static MajorGradeScore majorGradeScore = new MajorGradeScore();
    private MajorGradeScore() {}

    public static String gradeMarking(int score) {
        if (score >= 95)
            return "S";
        else if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else
            return "F";
    }
}
