package media;


public class Television {
    private int volume;
    private int currentProgram;
    private boolean turnOn;
    
    public int getVolume() {
        return this.volume;
    }
    
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public int getCurrentProgram() {
        return this.currentProgram;
    }
    
    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }
    
    public boolean getTurnOn() {
        return this.turnOn;
    }
    
    public void setTurnOn(boolean turnOn) {
        this.turnOn = turnOn;
    }
    
    public void info() {
        System.out.println("Zvuk je na: " + getVolume());
        System.out.println("Trenutni program je: " + getCurrentProgram());
        System.out.println("Ukljucen: " + getTurnOn());
        System.out.println("");
    }
}
