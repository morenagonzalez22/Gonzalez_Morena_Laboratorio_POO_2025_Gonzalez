package temperatura;

public class Temperatura {
    private float gradosCelsius;

    public Temperatura(float gradosCelsius) {
        this.gradosCelsius = gradosCelsius;
    }

    public void setGradosCelsius(double c) {
        this.gradosCelsius = (float)c;
    }

    public float getGradosCelsius() {
        return gradosCelsius;
    }

    public void mostrarFarenheit() {
        float f = (gradosCelsius * 9 / 5) + 32;
        System.out.println("Temperatura en Farenheit: " + f);
    }
}
