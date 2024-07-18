package com.walking.lesson17_enum.task1.answer;

public enum GreetingType {
    Hi("Hi", "Hello"),
    BYE("Bye", "Good bye"),
    HOW_ARE_YOU("How are you", "How are you doing"),
    UNKNOWN_TYPE(null, "Unknown greeting");

    private final String greeting;
    private final String answer;

    GreetingType(String greeting, String answer) {
        this.greeting = greeting;
        this.answer = answer;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getAnswer() {
        return answer;
    }

    public static GreetingType findGreetingType(String greeting) {
        if (greeting == null) {
            return UNKNOWN_TYPE;
        }

        for (GreetingType greetingType : GreetingType.values()) {
            if (greetingType.getGreeting().equals(greeting)) {
                return greetingType;
            }
        }

        return UNKNOWN_TYPE;
    }
}
