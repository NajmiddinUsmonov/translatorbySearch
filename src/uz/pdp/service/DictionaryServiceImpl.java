package uz.pdp.service;

import uz.pdp.model.Result;
import uz.pdp.model.Word;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DictionaryServiceImpl implements DictionaryService{
    HashMap<String,Word> map=new HashMap<>();
   private ArrayList<Word> words=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

   ArrayList<Word> getWords(){
       return words;
   }



    public  DictionaryServiceImpl(){
        ArrayList<String> strings1=new ArrayList<>();
        strings1.add("Hello world,my friends");
        strings1.add("Hello,my friends");

        ArrayList<String> strings2=new ArrayList<>();
        strings2.add("Hi");
        strings2.add("Hi,How are you?");
        map.put("Hi",new Word("Salom",strings2));



    }

    @Override
    public void addWord() {
        Result result=new Result();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word");
        String addedWord=scanner.nextLine();
        map.put(addedWord);



    }


    @Override
    public void addWord(String a) {

    }

    @Override
    public void getWord() {
        System.out.println("Enter the word");
        String enteredWord=scanner.nextLine();

    }

    @Override
    public void editWord() {

    }

    @Override
    public void deleteWord() {

    }

    @Override
    public ArrayList<Word> search() {
        return null;
    }


}
