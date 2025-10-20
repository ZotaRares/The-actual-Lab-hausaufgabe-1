public class Noten {
    public int[] getInsufficientGrades(int[] grades) {
        int count = 0;

        for (int grade : grades) {
            if (grade < 40) {
                count++;
            }
        }
        int[] insufficient = new int[count];
        int index = 0;
        for (int grade : grades) {
            if (grade < 40) {
                insufficient[index++] = grade;
            }
        }
        return insufficient;
    }

    public float Average(int[] grades) {
        float sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (float) (sum / grades.length);
    }

    public int[] Rounding(int[] grades) {
        int[] rounded = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];

            if (grade < 38) {
                rounded[i] = grade; // no rounding
            } else {
                int nextMultiple = ((grade / 5) + 1) * 5;
                if (nextMultiple - grade < 3)
                    rounded[i] = nextMultiple;
                else
                    rounded[i] = grade;
            }
        }
        return rounded;
    }

    public int HighestGradeValue(int[] grades) {
        int[] rounded = Rounding(grades);
        int highest = rounded[0];
        for (int i = 1; i < grades.length; i++) {
            if (rounded[i] > highest) {
                highest = rounded[i];
            }
        }
        return highest;
    }


}
