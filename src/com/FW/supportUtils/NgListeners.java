package com.FW.supportUtils;


import org.apache.log4j.Logger;
import org.testng.IExecutionListener;

public class NgListeners implements IExecutionListener {

	private static final Logger log = Logger.getLogger(NgListeners.class);

	@Override
	public void onExecutionStart() {
		System.out.println(">>>>>>>>>>>>> Starting Execution...");
		DataTransformer.initDataFromSource();
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("Finished Execution!! <<<<<<<<<<<<");

	}


}
