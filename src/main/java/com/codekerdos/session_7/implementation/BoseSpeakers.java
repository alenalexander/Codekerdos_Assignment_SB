package com.codekerdos.session_7.implementation;

import com.codekerdos.session_7.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers  implements Speakers {
    @Override
    public String makeSound() {
        return "Playing song with the bose Speakers. Enjoy!!";
    }
}
