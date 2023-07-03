package Primary.controller;

import Primary.model.PrimaryModel;
import Primary.view.PrimaryView;

public class PrimaryController {
    private final PrimaryModel primaryModel;
    private final PrimaryView primaryView;

    public PrimaryController(PrimaryView primaryView, PrimaryModel primaryModel){
        this.primaryModel = primaryModel;
        this.primaryView = primaryView;
    }

    public void setCounting(int countingValue){
        primaryModel.assignSimulation(countingValue);
    }

    public int getCounting(){
        return primaryModel.getCountingValue();
    }

}
