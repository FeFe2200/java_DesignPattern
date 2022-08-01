package strategypattrn3;

public class BasicGradeScore implements GradeScore{
    private static BasicGradeScore basicGradeScore = new BasicGradeScore();;
    private BasicGradeScore() {}

    public static String gradeMarking(int score) {
        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 55)
            return "D";
        else
            return "F";
    }
}
