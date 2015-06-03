package it.cira.patterns.behavior.command;
public class CloseFileCommand implements Command {
 
    private FileSystemReceiver fileSystem;
     
    public CloseFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
    	//la richiesta di close è delegata al metodo closeFile del Receiver
        this.fileSystem.closeFile();
    }
 
}