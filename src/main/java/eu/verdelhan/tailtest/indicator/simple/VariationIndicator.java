package eu.verdelhan.tailtest.indicator.simple;

import eu.verdelhan.tailtest.Indicator;
import eu.verdelhan.tailtest.TimeSeries;

public class VariationIndicator implements Indicator<Double> {

	private TimeSeries data;

	public VariationIndicator(TimeSeries data) {
		this.data = data;
	}

	public Double getValue(int index) {
		return data.getTick(index).getVariation();
	}

	public String getName() {
		return getClass().getSimpleName();
	}
}
