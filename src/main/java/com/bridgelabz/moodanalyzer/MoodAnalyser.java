package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {

    private String message;

    // Default constructor
    public MoodAnalyser() {
        this.message = ""; // Default to an empty message
    }

    public MoodAnalyser(String message){
        this.message = message;
    }

    // Method to analyze the mood based on the message
    public String analyseMood(String message) {
        // Check if the message contains the word "Sad" (case-sensitive as per the test case)
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public String analyseMoodWithConstructor() {
        // Check if the message contains the word "Sad" (case-sensitive as per the test case)
        if (message.toLowerCase().contains("sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        // Create a MoodAnalyser object
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am feeling so sad today!");
        // Output the mood
        System.out.println("Mood: " + moodAnalyser.analyseMoodWithConstructor());
    }
}
