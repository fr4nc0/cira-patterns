package it.cira.patterns.behavior.command;
public class WriteFileCommand implements Command {
 
    private FileSystemReceiver fileSystem;
     
    public WriteFileCommand(FileSystemReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
    	//la richiesta di write è delegata al metodo writeFile del Receiver
        this.fileSystem.writeFile();
    }
 
}