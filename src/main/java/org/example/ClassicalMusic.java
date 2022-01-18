package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}