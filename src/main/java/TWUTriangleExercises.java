
class TWUTriangleExercises extends Asterisk {
    TWUTriangleExercises() {
    }

    void drawAsterisk() {
        System.out.println(getNAsterisks(1));
    }

    void drawAsterisks(int i) {
        if (checkInputNumberIsInvalid(i)) return;
        System.out.println(getNAsterisks(i));
    }

    void drawRowsAsterisk(int i) {
        for (int j = 0; j < i; j++) {
            drawAsterisks(1);
        }
    }

    void drawRightTriangle(int i) {
        for (int j = 0; j < i; j++) {
            drawAsterisks(j + 1);
        }
    }


    private boolean checkInputNumberIsInvalid(int i) {
        if (i <= 0) {
            System.out.println("");
            return true;
        }
        return false;
    }

}

