public class HeatManager {
    private int temperature = 0;
    private boolean heatingStatus = false;

    public void turnHeatingOn() {
        this.heatingStatus = true;
    }

    public void turnHeatingOff() {
        this.heatingStatus = false;
    }

    public void increaseTemperature() {
        this.temperature += Configuration.heatIncreaseDecreaseStepValue;
    }

    public void decreaseTemperature() {
        this.temperature -= Configuration.heatIncreaseDecreaseStepValue;
    }

    private String buildCurrentHeatOn() {
        return "Le chauffage est allumé, et la température de chauffe actuelle est: " + this.temperature + "°C";
    }

    private String buildCurrentHeatOff() {
        return "Le chauffage est éteint.";
    }

    @Override
    public String toString() {
        return this.heatingStatus ? this.buildCurrentHeatOn() : this.buildCurrentHeatOff();
    }
}
