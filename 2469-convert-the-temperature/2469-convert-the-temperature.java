class Solution {
    public double[] convertTemperature(double celsius) {
    double[] degree = new double[2];
    degree[0] = celsius + 273.15;
    degree[1]  = ((celsius*(1.80))+32);
     return degree;
        }
}