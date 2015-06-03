package it.cira.patterns.behavior.command;

public class FileSystemClient {
 
    public static void main(String[] args) {
        //Creo l’oggetto Receiver
        FileSystemReceiver fs = new FileSystemReceiver();
         
        //Creo un Command concreto e lo associo al Receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);
         
        //Creo un Invoker associandogli un Command
        FileInvoker file = new FileInvoker(openFileCommand);
         
        //richiamo l’azione sull’Invoker
        file.execute();
         
        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();
         
        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
 
}