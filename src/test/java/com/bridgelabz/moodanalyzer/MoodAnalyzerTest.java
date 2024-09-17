package com.bridgelabz.moodanalyzer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    // method name convention-
    // 1) whatIsGivenToYou_whatActionShouldTake_whatOutputItWillReturn()
    // 2) whatIsGivenToYou_whatOutputItWillReturn()

    // Test Case 1.1: Given "I am in Sad Mood" message, Should Return "Sad"
    @Test
    public void givenSadMoodMessage_ShouldReturnSadMood(){
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("I am in a Sad mood.");
        Assertions.assertEquals("Sad", mood);
    }

    // Test Case 1.2: Given "I am in Any Mood" message, Should Return "Happy"
    @Test
    public void givenAnyMoodMessage_ShouldReturnHappy(){
        MoodAnalyser analyser = new MoodAnalyser();
        String mood = analyser.analyseMood("I am in any mood.");
        Assertions.assertEquals("Happy", mood);
    }

    // Repeat Test Case: 1.1
    @Test
    public void givenSadMoodMessageWithConstructor_ShouldReturnSadMood() throws MoodAnalyzerException {
        MoodAnalyser analyser = new MoodAnalyser("I am in sad mood today");
        String mood = analyser.analyseMoodWithConstructor();
        Assertions.assertEquals("Sad", mood);
    }

    // Repeat Test Case: 1.2
    @Test
    public void givenAnyMoodMessageWithConstructor_ShouldReturnHappyMood() throws MoodAnalyzerException {
        MoodAnalyser analyser = new MoodAnalyser("I am in any mood.");
        String mood = analyser.analyseMoodWithConstructor();
        Assertions.assertEquals("Happy", mood);
    }


}
