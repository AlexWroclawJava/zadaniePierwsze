package pl.Obliczenia;

public class ConverterMiar {

    public double metersToCentimeters(String m) {
        return (Double.valueOf(m) * 100);
    }

    public double metersToMilimeters(String m) {
        return (Double.valueOf(m) * 1000);
    }


    public double centimitersToMeters(String cm) {
        return (Double.valueOf(cm) / 100);
    }

    public double centimitersToMilimeters(String cm) {
        return (Double.valueOf(cm) * 10);
    }


    public double milimitersToMeters(String mm) {
        return (Double.valueOf(mm) / 1000);
    }

    public double milimitersToCentimeters(String mm) {
        return (Double.valueOf(mm) / 10);
    }

}
