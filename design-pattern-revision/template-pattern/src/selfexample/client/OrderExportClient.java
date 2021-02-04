package selfexample.client;

import selfexample.OrderExporter;
import selfexample.implementation.OrderFileExporter;

public class OrderExportClient {
	public static void main(String[] args) {

		 OrderFileExporter  /* OrderExporter */ exporter   = new OrderFileExporter();
		exporter.exportOrder();
	}
}
