package pl.Obliczenia;

public class ConverterWag {

    public double kilosToGrams(String kg) {
        return (Double.valueOf(kg) * 100);
    }

    public double kilosToMiligrams(String kg) {
        return (Double.valueOf(kg) * 1000000);
    }


    public double gramsToKilos(String gm) {
        return (Double.valueOf(gm) / 1000);
    }

    public double gramsToMiligrams(String gm) {
        return (Double.valueOf(gm) * 1000);
    }


    public double miligramsToKilos(String mg) {
        return (Double.valueOf(mg) / 1000000);
    }

    public double miligramsToGrams(String mg) {
        return (Double.valueOf(mg) / 1000);
    }

}
