
class TWUTriangleExercises {
    TWUTriangleExercises() {
    }


    void printTest() {
        System.out.println("hello world");
    }


    void printAsterisk() {
        System.out.println("*");
    }

    void printAsterisks(int i) {
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

    void printRowsAsterisk(int i) {
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

