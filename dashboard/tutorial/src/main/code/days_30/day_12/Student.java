package main.code.days_30.day_12;

class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int idNumber, int[] testScores) {
        super(firstName, lastName, idNumber);
        this.testScores = testScores;
    }

    public char calculate(){
        int finalGrade = 0;
        for (int testScore : testScores) {
            finalGrade += testScore;
        }

        finalGrade /= testScores.length;

        if (finalGrade <= 100 && finalGrade >= 90)
            return 'O';
        else if (finalGrade <= 90 && finalGrade >= 80)
            return 'E';
        else if (finalGrade <= 80 && finalGrade >= 70)
            return 'A';
        else if (finalGrade <= 70 && finalGrade >= 55)
            return 'P';
        else if (finalGrade <= 55 && finalGrade >= 40)
            return 'D';
        else
            return 'T';
    }
}
