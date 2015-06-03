package it.cira.patterns.behavior.command;
 
public class OpenFileCommand implements Command {
 
    private FileSystemReceiver fileSystem;
     
    public OpenFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //la richiesta di open è delegata al metodo openFile del Receiver
        this.fileSystem.openFile();
    }
 
}