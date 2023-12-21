package practice.parallel_tasks;

import practice.MyTaskImplements;

public class MultiThreadAppl {
    private static final int MAX = 10;
    private static final int SIZE = 3;

    public static void main(String[] args) {

        System.out.println("Main thread started");
               MyTaskImplements task = new MyTaskImplements("Parallel task ",MAX);
               task.run();// запуск второго thread
        MyTaskImplements task2 = new MyTaskImplements("Parallel task ", MAX);
        MyTaskExtends task1 = new MyTaskExtends("Parallel two ",MAX);
        Thread thread = new Thread(task2);//создали новый поток и передали ему задачу
        Thread thread1 = new Thread(task1);//создали параллельный поток и передали ему задачу
        thread.start();
        thread1.start();

        MyTaskImplements[] tasks =new MyTaskImplements[SIZE];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = new MyTaskImplements("Name # " + i,MAX);
        }
        Thread []threads = new Thread[SIZE];
        for (int i = 0; i < threads.length; i++) {
            threads[i]=new Thread(tasks[i]);
        }


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
