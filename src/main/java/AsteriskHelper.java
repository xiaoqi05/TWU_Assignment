public class AsteriskHelper {
    public StringBuffer getNBlanks(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(" ");
        }
        return stringBuffer;
    }

    public StringBuffer getNAsterisks(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append("*");
        }
        return stringBuffer;
    }

    public void print(String content) {
        System.out.println(content);
    }

    public boolean checkInputNumberIsInvalid(int i) {
        if (i <= 0) {
            print("");
            return true;
        }
        return false;
    }
}