import java.util.ArrayList;

public class MyTask {

    private ArrayList<Integer> answers = new ArrayList<>();

    MyTask(int start, int end) {
        getPrimes(start, end);
    }

    public ArrayList getAnswers() {
        return answers;
    }

    private void getPrimes(int from, int to) {
        for(int i = from; i <= to; i++) {
            if (isPrime(i)) {
                answers.add(i);
            }
        }
    }

    private boolean isPrime(int number) {

        if (number < 2) { return false; }

        for(int i = 2;  i * i <= number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int number: answers) {
            str.append(number);
            if (number != answers.get(answers.size() - 1)) {
                str.append(", ");
            }
        }
        return str.toString();
    }
}
