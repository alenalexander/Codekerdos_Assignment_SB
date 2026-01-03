package com.codekerdos.session_7.implementation;

import com.codekerdos.session_7.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with BridgeStoneTyres";
    }
}
