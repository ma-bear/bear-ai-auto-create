package com.mabear.bearaicodemother.langgraph4j.demo;

import org.bsc.langgraph4j.action.NodeAction;

import java.util.List;
import java.util.Map;

/**
 *
 * @author: ma bear
 * @date: 2025/8/27 18:52
 */ // Node that adds a response
class ResponderNode implements NodeAction<SimpleState> {
    @Override
    public Map<String, Object> apply(SimpleState state) {
        System.out.println("ResponderNode executing. Current messages: " + state.messages());
        List<String> currentMessages = state.messages();
        if (currentMessages.contains("Hello from GreeterNode!")) {
            return Map.of(SimpleState.MESSAGES_KEY, "Acknowledged greeting!");
        }
        return Map.of(SimpleState.MESSAGES_KEY, "No greeting found.");
    }
}
