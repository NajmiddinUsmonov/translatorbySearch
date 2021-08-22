package uz.pdp.model;

import java.util.ArrayList;

public class Word {
    private String translation;
    private ArrayList<String> examples;

    public Word() {
    }

    public Word(String translation, ArrayList<String> examples) {
        this.translation = translation;
        this.examples = examples;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public ArrayList<String> getExamples() {
        return examples;
    }

    public void setExamples(ArrayList<String> examples) {
        this.examples = examples;
    }


}
