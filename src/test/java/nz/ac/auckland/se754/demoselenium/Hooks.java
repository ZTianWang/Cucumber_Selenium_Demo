package nz.ac.auckland.se754.demoselenium;

import io.cucumber.java.AfterStep;

public class Hooks {
    @AfterStep
    public void afterEachStep(){
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
