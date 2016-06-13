
class TWUTriangleExercises {
    TWUTriangleExercises() {
    }


    void printTest() {
        System.out.println("hello world");
    }


    void drawAsterisk() {
        System.out.println("*");
    }

    void drawAsterisks(int i) {
        if (i <= 0) {
            System.out.println("");
            return;
        }
        StringBuffer resultAsterisks = new StringBuffer();
        for (int j = 0; j < i; j++) {
            resultAsterisks.append("*");
        }
        System.out.println(resultAsterisks);
    }

    void drawRowsAsterisk(int i) {
        if (i <= 0) {
            System.out.println("");
            return;
        }
        StringBuffer resultAsterisks = new StringBuffer();
        for (int j = 0; j < i; j++) {
            resultAsterisks.append("*\n");
        }
        System.out.println(resultAsterisks);
    }
}

