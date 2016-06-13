class Asterisk {
    StringBuffer getNBlanks(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(" ");
        }
        return stringBuffer;
    }

    StringBuffer getNAsterisks(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("*");
        }
        return stringBuffer;
    }

    void print(String content) {
        System.out.println(content);
    }
}
