public class Task implements Comparable<Task>{
    private int priority;
    private String name;
    private int duration;

    public Task(int priority, String name, int duration) {
        this.priority = priority;
        this.name = name;
        this.duration = duration;
    }

    public int compareTo(Task t){
        if(this.getPriority()!=t.getPriority())
            return Integer.compare(t.getPriority(),this.getPriority());
        else{
            return Integer.compare(this.getDuration(),t.getDuration());
        }
    }
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
