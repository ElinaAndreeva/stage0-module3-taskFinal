package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        int fahrenheit = (int) ((temperatureCelsius * 1.8) + 32);
        System.out.println(fahrenheit);
    }
}
