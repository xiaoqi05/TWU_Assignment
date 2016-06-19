
public class TriangleExercises  {
    private AsteriskHelper asteriskHelper;
    public TriangleExercises() {
        asteriskHelper = new AsteriskHelper();
    }

    public void drawAsterisk() {
        asteriskHelper.print(asteriskHelper.getNAsterisks(1).toString());
    }

    public void drawAsterisks(int i) {
        if (asteriskHelper.checkInputNumberIsInvalid(i)) return;
        asteriskHelper.print(asteriskHelper.getNAsterisks(i).toString());
    }

    public void drawRowsAsterisk(int i) {
        for (int j = 0; j < i; j++) {
            drawAsterisks(1);
        }
    }

    public void drawRightTriangle(int i) {
        for (int j = 0; j < i; j++) {
            drawAsterisks(j + 1);
        }
    }




}

