import java.time.LocalDateTime;
import java.util.*;

public class TaskScheduler{
    private PriorityQueue<Task> scheduledTasks;
    private ArrayDeque<Task> pendingTasks;
    private HashMap<Task,ArrayList<LocalDateTime>> completedTasks;

    public TaskScheduler(){
        // Comparator method
        /*scheduledTasks = new PriorityQueue<>((a,b)->{
            if(a.getPriority()!=b.getPriority())
             return Integer.compare(b.getPriority(),a.getPriority());
            else{
                return Integer.compare(a.getDuration(),b.getDuration());
            }
        });*/
        scheduledTasks = new PriorityQueue<>();
        pendingTasks = new ArrayDeque<>();
        completedTasks = new HashMap<>();
    }

    public void addTask(Task t){
        scheduledTasks.offer(t);
    }

    public void printAllTasks(){
        System.out.println("Scheduled Tasks (sorted by priority):");
        for(Task t: scheduledTasks){
            System.out.println("["+t.getPriority()+"] "+
                    t.getName() + " ( "+t.getDuration()+")");
        }

        System.out.println("Pending Tasks(FIFO order):");
        for(Task t:pendingTasks){
            System.out.println(t.getName() + ", " + t.getPriority()+", "+t.getDuration());
        }

        System.out.println("Completed Tasks: ");
        for(Map.Entry<Task,ArrayList<LocalDateTime>> entry:completedTasks.entrySet()){
            System.out.println(entry.getKey().getName() + ": (" +
                    entry.getValue().get(0)+","+
                    entry.getValue().get(1));
        }
    }

    public void delayTask(Task t){
        pendingTasks.offer(t);
        scheduledTasks.remove(t);
    }

    public void processTask(){
        if(!scheduledTasks.isEmpty()){
            Task t = scheduledTasks.poll();
            System.out.println("Processing Task: "+t.getPriority()+", "+
                    t.getName()+", "+t.getDuration());
            LocalDateTime timenow = LocalDateTime.now();
            ArrayList<LocalDateTime> list = new ArrayList<>();
            list.add(timenow);
            list.add(timenow.plusMinutes(t.getDuration()));
            completedTasks.put(t,list);
            //completedTasks.put(t,new ArrayList<>(Arrays.asList(timenow,timenow.plusMinutes(t.getDuration()))))
            return;
        }
        if(!pendingTasks.isEmpty()){
            Task t = pendingTasks.poll();
            System.out.println("Processing Task: "+t.getPriority()+", "+
                    t.getName()+", "+t.getDuration());
            return;
        }
        System.out.println("No more tasks left to be executed. Quitting.");
        return;
    }
}

class TaskSchedulerMain{
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        Task t = new Task(3,"Code Review", 20);
        scheduler.addTask(t);
        scheduler.addTask(new Task(5,"System Update", 45));
        Task t1 = new Task(2,"Database Backup", 30);
        scheduler.addTask(t1);
        scheduler.addTask(new Task(5,"Deploy New Feature", 50));
        scheduler.addTask(new Task(4,"Bug Fixing", 25));

        scheduler.printAllTasks();
        scheduler.processTask();
        scheduler.delayTask(t);
        scheduler.printAllTasks();
        scheduler.delayTask(t1);
        scheduler.printAllTasks();
        scheduler.processTask();
        scheduler.printAllTasks();
        scheduler.processTask();
    }
}
