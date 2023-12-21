package practice.parallel_tasks;

public class MyTaskExtends extends Thread{
    String name;
    int max;
    public MyTaskExtends (String name,int max){
        this.name=name;
        this.max=max;
    }
    @Override
    public void run() {
        System.out.println(name + " task started.");
        for (int i = 0; i < max; i++) {
            System.out.println(name + " cont " + i);
        } try {
            Thread.sleep(10); // положили поток спать
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + "task finished.");
    }
}
