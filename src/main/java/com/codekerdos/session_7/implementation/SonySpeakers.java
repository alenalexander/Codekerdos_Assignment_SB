package com.codekerdos.session_7.implementation;

import com.codekerdos.session_7.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing song with the Sony Speakers. Enjoy!!";
    }
}
