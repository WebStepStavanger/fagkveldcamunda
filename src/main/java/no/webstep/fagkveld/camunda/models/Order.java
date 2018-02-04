package no.webstep.fagkveld.camunda.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderId;
	private List<OrderLine> lines;
	
	public Order() {
		lines = new ArrayList<OrderLine>();
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public List<OrderLine> getLines() {
		return lines;
	}

	public void setLines(List<OrderLine> lines) {
		this.lines = lines;
	}
	
	
}
