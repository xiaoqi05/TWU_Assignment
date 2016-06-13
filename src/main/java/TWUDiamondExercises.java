
class TWUDiamondExercises extends Asterisk {
    TWUDiamondExercises() {
    }

    void drawIsoscelesTriangle(int i) {
        if (checkInputNumberIsInvalid(i)) return;
        StringBuilder resultAsterisks = getIsoscelesString(i);
        print(resultAsterisks.toString());

    }

    private StringBuilder getIsoscelesString(int i) {
        StringBuilder resultAsterisks = new StringBuilder();
        for (int j = 0; j < i; j++) {
            resultAsterisks.append(getOneLineInIsoscelesTriangle(j + 1, i));
            if (j != i - 1) {
                resultAsterisks.append("\n");
            }
        }
        return resultAsterisks;
    }

    private StringBuffer getOneLineInIsoscelesTriangle(int currentLine, int totalLines) {
        StringBuffer resultAsterisks = new StringBuffer();
        int currentNumberOfAsterisks = 1 + (currentLine - 1) * 2;
        resultAsterisks.append(getNBlanks(totalLines - currentLine)).
                append(getNAsterisks(currentNumberOfAsterisks)).
                append(getNBlanks(totalLines - currentLine));
        return resultAsterisks;
    }


    void drawDiamond(int i) {
        StringBuilder resultAsterisks = new StringBuilder();
        if (checkInputNumberIsInvalid(i)) return;
        for (int j = 0; j < i; j++) {
            if (j == i - 1) {
                continue;
            }
            resultAsterisks.append(getOneLineInIsoscelesTriangle(j + 1, i));
            if (j != i - 2) {
                resultAsterisks.append("\n");
            }
        }
        resultAsterisks.append("\n").append(getIsoscelesString(i).reverse());
        print(resultAsterisks.toString());

    }
}

