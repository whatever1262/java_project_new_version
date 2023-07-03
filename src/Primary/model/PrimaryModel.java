package Primary.model;

public class PrimaryModel {
    Simulation simulation = new Simulation();

    public void assignSimulation(int countingValue){
        simulation.setCounting(countingValue);
    }

    public int getCountingValue(){
        return simulation.getCounting();
    }

}
