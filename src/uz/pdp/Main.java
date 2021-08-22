package uz.pdp;

import uz.pdp.model.Word;
import uz.pdp.service.DictionaryServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DictionaryServiceImpl dictionaryService=new DictionaryServiceImpl();

        while(true){
            System.out.println("0=>Exit,1=>Add, 2=>Get, 3=>Edit, 4=>Delete, 5=>Search");
            switch (scanner.nextInt()){
                case 0:
                    return;
                case 1:
                    dictionaryService.addWord( "Hello");
                    break;
                case 2:
                    dictionaryService.getWord();
                    break;
                case 3:
                    dictionaryService.editWord();
                    break;
                case 4:
                    dictionaryService.deleteWord();
                    break;
                case 5:
                    dictionaryService.search();
                    break;
            }
        }


    }
}
