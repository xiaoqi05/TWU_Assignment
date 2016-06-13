
class TWUDiamondExercises extends Asterisk {
    TWUDiamondExercises() {
    }

    void drawIsoscelesTriangle(int i) {
        if (checkInputNumberIsInvalid(i)) return;
        StringBuilder resultAsterisks = new StringBuilder();
        for (int j = 0; j < i; j++) {
            resultAsterisks.append(getOneLineInIsoscelesTriangle(j + 1, i)).append("\n");
        }
        print(resultAsterisks.toString());

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
        print("  *  \n *** \n*****\n *** \n  *  \n");
    }
}

