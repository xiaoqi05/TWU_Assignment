
class DiamondExercises  {
    AsteriskHelper asteriskHelper;
    DiamondExercises() {
        asteriskHelper = new AsteriskHelper();
    }

    void drawIsoscelesTriangle(int i) {
        if (asteriskHelper.checkInputNumberIsInvalid(i)) return;
        StringBuilder resultAsterisks = getIsoscelesString(i);
        asteriskHelper.print(resultAsterisks.toString());

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
        resultAsterisks.append(asteriskHelper.getNBlanks(totalLines - currentLine)).
                append(asteriskHelper.getNAsterisks(currentNumberOfAsterisks)).
                append(asteriskHelper.getNBlanks(totalLines - currentLine));
        return resultAsterisks;
    }


    void drawDiamond(int i) {
        StringBuilder resultAsterisks = new StringBuilder();
        if (asteriskHelper.checkInputNumberIsInvalid(i)) return;
        resultAsterisks.append(getDiamondWithoutLastLine(i));
        resultAsterisks.append("\n").append(getIsoscelesString(i).reverse());
        asteriskHelper.print(resultAsterisks.toString());

    }

    private StringBuilder getDiamondWithoutLastLine(int i) {
        StringBuilder resultAsterisks = new StringBuilder();
        for (int j = 0; j < i; j++) {
            if (j == i - 1) {
                continue;
            }
            resultAsterisks.append(getOneLineInIsoscelesTriangle(j + 1, i));
            if (j != i - 2) {
                resultAsterisks.append("\n");
            }
        }
        return resultAsterisks;
    }

    void drawDiamondWithNameInMiddle(int i) {
        StringBuilder resultAsterisks = new StringBuilder();
        if (asteriskHelper.checkInputNumberIsInvalid(i)) return;
        StringBuilder withoutLastLine = getDiamondWithoutLastLine(i);
        resultAsterisks.append(withoutLastLine);
        resultAsterisks.append("\nxiaoqi\n").append(withoutLastLine.reverse());
        asteriskHelper.print(resultAsterisks.toString());
    }
}

