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

    public String analyseMoodWithConstructor() throws MoodAnalyzerException {
        try {
            if(message == null){
                throw new MoodAnalyzerException("Invalid Mood: Null Message provided");
            }
            // Check if the message contains the word "Sad" (case-sensitive as per the test case)
            if (message.toLowerCase().contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch (NullPointerException e){
            throw new MoodAnalyzerException(("Invalid Mood: Null Message provided"));
        }

    }

    public static void main(String[] args) throws MoodAnalyzerException {
        try {
            // Example: Create MoodAnalyser object with a null message
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            System.out.println("Mood: " + moodAnalyser.analyseMoodWithConstructor()); // Expected: Exception
        } catch (MoodAnalyzerException e) {
            System.out.println(e.getMessage()); // Expected: "Invalid mood: Null message provided"
        }
    }
}
