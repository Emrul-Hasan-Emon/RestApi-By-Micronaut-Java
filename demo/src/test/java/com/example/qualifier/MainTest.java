package com.example.qualifier;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class MainTest {
    @Inject
    private  Main obj;

    @Test
    void test() {
        obj.process();
    }
}