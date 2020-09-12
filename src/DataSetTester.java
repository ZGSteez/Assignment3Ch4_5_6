public class DataSetTester {
    public static void main(String[] args) {
        DataSet newDataSet = new DataSet();
        newDataSet.add(0);
        newDataSet.getAverage();
        newDataSet.returnAvg();
        newDataSet.getStandardDeviation();
        newDataSet.showResults();
    }

  /*
    Sample Run
        Enter some floating point numbers. To get the standard deviation, enter 123456789 to stop.
        12 03 399 -5.512 96.312 12.12 69.52 101.32 9565.93 12.1 12.3 -1.56 -1.92 -1.95949 -1.9696969 123456789
        Sum: 10270.680813100002
        Counter: 15
        Average : 684.7120542066667
        Standard Deviation: 176.79189219265933
   */
}
