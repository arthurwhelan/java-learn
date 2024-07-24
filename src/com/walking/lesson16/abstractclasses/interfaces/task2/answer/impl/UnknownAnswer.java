package com.walking.lesson16.abstractclasses.interfaces.task2.answer.impl;

import com.walking.lesson16.abstractclasses.interfaces.task2.answer.Answer;

public class UnknownAnswer implements Answer {
    @Override
    public String getAnswer() {
        return "Unknown message";
    }
}
