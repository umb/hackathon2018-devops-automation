package ch.umb.hackathon.devops;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Named;

@Named("powershell")
public class PowershellDelegate implements JavaDelegate {


    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String command = (String) delegateExecution.getVariable("command");
        Runtime.getRuntime().exec(command);
        System.out.println("executed powershell command: " + command);
    }
}
