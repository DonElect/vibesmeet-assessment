package com.vibes.meet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;


class GrantProcessorTest {


    @Test
    void latestStatus_null_test() {
        Map<String, String> result = new LinkedHashMap<>();
        List<GrantProcessor.GrantEvent> events = new ArrayList<>();
        events.add(null);

        when(GrantProcessor.latestStatus(events)).thenReturn(result);

        GrantProcessor.latestStatus(events);
    }

    @Test
    void latestStatus__test() {
        Map<String, String> result = new LinkedHashMap<>();
        List<GrantProcessor.GrantEvent> events = new ArrayList<>();
        events.add(null);

        when(GrantProcessor.latestStatus(events)).thenReturn(result);

        GrantProcessor.latestStatus(events);
    }
}