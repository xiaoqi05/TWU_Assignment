
class TWUTriangleExercises extends Asterisk {
    TWUTriangleExercises() {
    }

    void drawAsterisk() {
        print(getNAsterisks(1).toString());
    }

    void drawAsterisks(int i) {
        if (checkInputNumberIsInvalid(i)) return;
        print(getNAsterisks(i).toString());
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




}

