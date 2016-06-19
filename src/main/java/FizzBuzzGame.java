public class FizzBuzzGame {
    private int[] numbers;

    public FizzBuzzGame() {
        this.numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
    }

    private void print(String content) {
        System.out.println(content);
    }


    public void fizzBuzz() {
        for (int i : numbers) {
            print(sayNumber(i));
        }
    }

    public String sayNumber(int i) {
        String result;
        if (i % 15 == 0) {
            result = "FizzBuzz";
        } else if (i % 3 == 0) {
            result = "Fizz";
        } else if (i % 5 == 0) {
            result = "Buzz";
        } else {
            result = i + "";
        }

        return result;
    }
}
