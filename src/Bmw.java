public class Bmw extends car {
    private String model;
    private  String tuner;
    private String engine;

    @Override
    public void engine() {
        engine = "bmw engine";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTuner() {
        return tuner;
    }

    public void setTuner(String tuner) {
        this.tuner = tuner;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    @Override
    public String toString() {

        return  super.toString()+getModel()+" " +getEngine()+" "+getTuner();
    }
}
