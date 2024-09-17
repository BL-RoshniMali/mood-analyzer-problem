package com.bridgelabz.moodanalyzer;

public class MoodAnalyser {

    // Method to analyze the mood based on the message
    public String analyseMood(String message) {
        // Check if the message contains the word "Sad" (case-sensitive as per the test case)
        if (message.contains("Sad")) {
            return "Sad";
        } else {
            return "Happy";
        }
    }

    public static void main(String[] args) {
        // Create a MoodAnalyser object
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        // Call analyseMood function with a message
        String message = "I am feeling so sad today!";
        String mood = moodAnalyser.analyseMood(message);

        // Output the mood
        System.out.println("Mood: " + mood);
    }
}
