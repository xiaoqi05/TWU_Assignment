
class TWUDiamondExercises extends Asterisk{
    TWUDiamondExercises() {
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


}
