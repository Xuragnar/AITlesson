package practice;

public class MultiThreadAppl {
    private static final int MAX = 10;

    public static void main(String[] args) {

        System.out.println("Main thread started");
        //       MyTaskImplements task = new MyTaskImplements("Parallel task",MAX);
        //       task.run();// запуск второго thread
        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX);
        Thread thread = new Thread(task);
        thread.start();

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main count = " + i);
            try{
                Thread.sleep(10);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main thread finished.");
    }
}
