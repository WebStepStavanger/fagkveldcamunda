package no.webstep.fagkveld.camunda.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ProcessVariablesDelegate implements JavaDelegate{

	public void execute(DelegateExecution ex) throws Exception {

		String input = (String) ex.getVariable("input");
		
		ex.setVariable("ok", false);
		
		if ("hei".equalsIgnoreCase(input)) {
			ex.setVariable("ok", true);
		}
		
		
	}

}
