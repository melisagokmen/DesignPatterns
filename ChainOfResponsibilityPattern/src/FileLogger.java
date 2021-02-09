public class FileLogger extends AbstractLogger{

    @Override
    protected void write(String message) {
        System.out.println("File Console::Logger: "+message);
    }
     public FileLogger(int level) {
        this.level=level;
    }
}
