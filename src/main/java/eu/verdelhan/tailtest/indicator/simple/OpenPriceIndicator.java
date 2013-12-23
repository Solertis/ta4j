package eu.verdelhan.tailtest.indicator.simple;

import eu.verdelhan.tailtest.Indicator;
import eu.verdelhan.tailtest.TimeSeries;

public class OpenPriceIndicator implements Indicator<Double> {

	private TimeSeries data;

	public OpenPriceIndicator(TimeSeries data) {
		this.data = data;
	}

	public Double getValue(int index) {
		return data.getTick(index).getOpenPrice();
	}

	public String getName() {
		return getClass().getSimpleName();
	}
}