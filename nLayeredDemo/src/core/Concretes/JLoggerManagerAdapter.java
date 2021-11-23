package core.Concretes;

import core.Abstracts.jLoggerService;
import jLogger.JLogger;

public class JLoggerManagerAdapter implements jLoggerService{

    @Override
    public void LogToSysytem(String name) {
        JLogger jLogger=new JLogger();
        jLogger.Log(name);
        
    }
    
}
