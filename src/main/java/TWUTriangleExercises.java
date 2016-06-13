
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
        StringBuffer resultAsterisks = new StringBuffer();
        for (int j = 0; j < i; j++) {
            resultAsterisks.append("*");
        }
        System.out.println(resultAsterisks);
    }
}

