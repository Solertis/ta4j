package eu.verdelhan.tailtest.strategy;

import eu.verdelhan.tailtest.Strategy;
import eu.verdelhan.tailtest.Trade;

public abstract class AbstractStrategy implements Strategy {

	public boolean shouldOperate(Trade trade, int index) {
		if (trade.isNew()) {
			return shouldEnter(index);
		} else if (trade.isOpened()) {
			return shouldExit(index);
		}
		return false;
	}
	
	public Strategy and(Strategy strategy){
		return new AndStrategy(this,strategy);
	}
	
	public Strategy or(Strategy strategy){
		return new OrStrategy(this,strategy);
	}
}