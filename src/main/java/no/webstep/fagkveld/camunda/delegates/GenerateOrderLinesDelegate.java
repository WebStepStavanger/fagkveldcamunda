package no.webstep.fagkveld.camunda.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import no.webstep.fagkveld.camunda.models.Order;
import no.webstep.fagkveld.camunda.models.OrderLine;

public class GenerateOrderLinesDelegate implements JavaDelegate{

	public void execute(DelegateExecution execution) throws Exception {
		Long numLines = (Long) execution.getVariable("numLines");
		
		Order order = new Order();
		order.setOrderId(1);
		
		for (int i = 1; i <= numLines; i++) {
			OrderLine line = new OrderLine();
			line.setName(String.format("Order line %s", i));
			line.setLineNumber(i);
			line.setPrice((long) (Math.random() * 10000));
			order.getLines().add(line);
		}
		
		execution.setVariable("order", order);
		
	}

}
