package com.github.pyro2266.lightit.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "lightit")
public class LightItConfiguration {

    private int ledCount;
    private boolean simulatedMode;

    public int getLedCount() {
        return ledCount;
    }

    public void setLedCount(int ledCount) {
        this.ledCount = ledCount;
    }

    public boolean isSimulatedMode() {
        return simulatedMode;
    }

    public void setSimulatedMode(boolean simulatedMode) {
        this.simulatedMode = simulatedMode;
    }
}
