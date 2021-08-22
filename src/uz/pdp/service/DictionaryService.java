package uz.pdp.service;

import uz.pdp.model.Word;

import java.util.ArrayList;

public interface DictionaryService {
    void addWord(String a);
    void getWord();
    void editWord();
    void deleteWord();
    ArrayList<Word> search();
}
