package com.sudheer.output;

import com.sudheer.output.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via setter method
	public void setOutputGenerator(IOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}