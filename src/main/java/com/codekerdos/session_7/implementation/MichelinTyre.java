package com.codekerdos.session_7.implementation;

import com.codekerdos.session_7.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre implements Tyres {
    @Override
    public String rotate() {
        return "Vehicle moving with Michelin tyres";
    }
}
