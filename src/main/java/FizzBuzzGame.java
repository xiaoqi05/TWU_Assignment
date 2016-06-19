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
        String result = "";
        int aliquotOfFifteen = 15;
        int aliquotOfThere = 3;
        int aliquotOfFive = 5;

        result += i % aliquotOfFifteen == 0 ? "FizzBuzz" : "";
        result += i % aliquotOfFifteen != 0 && i % aliquotOfThere == 0 ? "Fizz" : "";
        result += i % aliquotOfFifteen != 0 && i % aliquotOfFive == 0 ? "Buzz" : "";

        result += result.equals("") ? i : "";


        return result;
    }
}
