
public class MainL9 {

    static class BankAccount {

        int account;

        BankAccount(int account) {
            this.account = account;
        }

        synchronized void deposit(BankAccount account, int sum) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }
            account.takeMoney(this, sum);
        }

        synchronized void takeMoney(BankAccount account, int sum) {
            account.account -= sum;
            this.account += sum;
        }
    }

    public static void main(String[] args) {

        MyTask m1 = new MyTask(1,10);
        MyTask m2 = new MyTask(11,50);
        MyTask m3 = new MyTask(51,100);
        MyTask m4 = new MyTask(100, 300);

        TaskQueue taskQueue = new TaskQueue();

        taskQueue.push(m1);
        taskQueue.push(m2);
        taskQueue.push(m3);
        taskQueue.push(m4);


        taskQueue.showResults();

    }

}


