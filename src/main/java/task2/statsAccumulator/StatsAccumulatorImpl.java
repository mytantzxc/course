package task2.statsAccumulator;

public class StatsAccumulatorImpl implements StatsAccumulator {

    private int min = 0;
    private int max = 0;
    private int sum = 0;
    private int count = 0;

    @Override
    public void add(int value) {
        if(value > this.max) max = value;
        else if(value < min) min = value;
        this.sum+=value;
        this.count++;
    }

    @Override
    public int getMin() {
        return this.min;
    }

    @Override
    public int getMax() {
        return this.max;
    }

    @Override
    public int getCount() {
        return this.count;
    }

    @Override
    public Double getAvg() {
        return (double)this.sum / (double)this.count ;
    }
}
