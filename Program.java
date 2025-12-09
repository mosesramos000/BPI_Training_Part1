package module2_Activity5;

public abstract class Program {
	 
    private String name;
    private boolean isRunning = false;
 
    public Program() {
    }
 
    public Program(String name) {
        this.name = name;
    }
 
    abstract void run();
    abstract void stop();
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
 
    public void setRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }
 
    public boolean getIsRunning() {
        return isRunning;
    }
}
