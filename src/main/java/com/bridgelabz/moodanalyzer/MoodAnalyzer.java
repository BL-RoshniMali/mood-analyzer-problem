package com.bridgelabz.moodanalyzer;

public class MoodAnalyzer {

    // Message field to store the mood message
    private String message;

    // Default constructor
    public MoodAnalyzer() {
        // No initialization
    }

    // Parameterized constructor that takes the message
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    // Method to analyze the mood using the message field
    public String analyseMood() {
        if (this.message.toLowerCase().contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }

    public static void main(String[] args) {
        // Example usage with parameterized constructor
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("I am in Sad Mood");
        System.out.println("Mood: " + moodAnalyser.analyseMood());

        // Example usage with default constructor
        MoodAnalyzer moodAnalyserDefault = new MoodAnalyzer();
        moodAnalyserDefault.message = "I am in Happy Mood";
        System.out.println("Mood: " + moodAnalyserDefault.analyseMood());
    }
}
