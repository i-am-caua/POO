package encapsulamento;

public class Temperatura {
    private double celsius;

    public double converterParaFahrenheit() {
        return (celsius * 1.8) + 32;
    }

    public double converterParaKelvin() {
        return celsius + 273.15;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        }
    }

    public static void main(String[] args) {
        Temperatura temp = new Temperatura();
        temp.setCelsius(25);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.converterParaFahrenheit());
        System.out.println("Kelvin: " + temp.converterParaKelvin());
    }
}
