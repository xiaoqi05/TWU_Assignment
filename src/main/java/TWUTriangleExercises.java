
class TWUTriangleExercises {
    TWUTriangleExercises() {
    }


    void printTest() {
        System.out.println("hello world");
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

    void drawIsoscelesTriangle(int i) {
        if (checkInputNumberIsInvalid(i)) return;
        StringBuffer resultAsterisks = new StringBuffer();
        for (int j = 0; j < i; j++) {
            resultAsterisks.append(getOneLineInIsoscelesTriangle(j + 1, i)).append("\n");
        }
        System.out.println(resultAsterisks);

    }

    private StringBuffer getOneLineInIsoscelesTriangle(int currentLine, int totalLines) {
        StringBuffer resultAsterisks = new StringBuffer();
        int currentNumberOfAsterisks = 1 + (currentLine - 1) * 2;
        resultAsterisks.append(getNBlanks(totalLines - currentLine)).
                append(getNAsterisks(currentNumberOfAsterisks)).
                append(getNBlanks(totalLines - currentLine));
        return resultAsterisks;
    }


    private boolean checkInputNumberIsInvalid(int i) {
        if (i <= 0) {
            System.out.println("");
            return true;
        }
        return false;
    }

    private StringBuffer getNBlanks(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(" ");
        }
        return stringBuffer;
    }

    private StringBuffer getNAsterisks(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("*");
        }
        return stringBuffer;
    }
}

