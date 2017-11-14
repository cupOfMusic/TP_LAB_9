import java.util.LinkedList;



public class TaskQueue {

    private LinkedList<MyTask> tasks = new LinkedList<>();

    MyTask pop() {
        return tasks.pop();
    }

    void push(MyTask task) {
        tasks.add(task);
    }

    void showResults() {
        for(int i = 0; i < tasks.size(); i++) {
            System.out.println("Task #" + i + ":" + tasks.get(i).getAnswers());
        }
    }

}
