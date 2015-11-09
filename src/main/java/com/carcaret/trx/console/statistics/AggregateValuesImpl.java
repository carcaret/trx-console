package com.carcaret.trx.console.statistics;

import com.carcaret.trx.console.statistics.Service.AggregateValues;

class AggregateValuesImpl implements AggregateValues {

  private final int avg;
  private final int min;
  private final int max;

  public AggregateValuesImpl(int avg, int min, int max) {
    super();
    this.avg = avg;
    this.min = min;
    this.max = max;
  }

  @Override
  public int avg() {
    return avg;
  }

  @Override
  public int min() {
    return min;
  }

  @Override
  public int max() {
    return max;
  }

}
