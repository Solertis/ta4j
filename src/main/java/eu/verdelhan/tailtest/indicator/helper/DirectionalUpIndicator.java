package eu.verdelhan.tailtest.indicator.helper;

import eu.verdelhan.tailtest.Indicator;
import eu.verdelhan.tailtest.TimeSeries;

public class DirectionalUpIndicator implements Indicator<Double>{

	private final Indicator<Double> admup;
	private final Indicator<Double> atr;
	private int timeFrame;

	public DirectionalUpIndicator(TimeSeries series, int timeFrame) {
		this.admup = new AverageDirectionalMovementUpIndicator(series, timeFrame);
		this.atr = new AverageTrueRangeIndicator(series, timeFrame);
		this.timeFrame = timeFrame;
	}
	public String getName() {
		return getClass().getSimpleName() + " timeFrame: " + timeFrame;
	}

	public Double getValue(int index) {
		
		return  admup.getValue(index) / atr.getValue(index);
	}

}
