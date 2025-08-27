package com.mabear.bearaicodemother.langgraph4j.demo;

import org.bsc.langgraph4j.action.NodeAction;

import java.util.Map;

// Node that adds a greeting
class GreeterNode implements NodeAction<SimpleState> {
    @Override
    public Map<String, Object> apply(SimpleState state) {
        System.out.println("GreeterNode executing. Current messages: " + state.messages());
        return Map.of(SimpleState.MESSAGES_KEY, "Hello from GreeterNode!");
    }
}

