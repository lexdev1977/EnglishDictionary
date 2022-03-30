package ReadDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadDictionary {

    private String pathFile;
    private List<String> engWord = new ArrayList<>();
    private List<String> transcription = new ArrayList<>();
    private List<String> translation = new ArrayList<>();



    public ReadDictionary(String pathFile) {
        this.pathFile = pathFile;

        File dictionaryFromFile = new File(pathFile);

        Scanner scannerDictionary;
        {
            try {
                scannerDictionary = new Scanner(dictionaryFromFile);
                scannerDictionary.useDelimiter(";");

                while (scannerDictionary.hasNext()) {
                    engWord.add(scannerDictionary.next());
                    transcription.add(scannerDictionary.next());
                    translation.add(scannerDictionary.next());
                }

            } catch (FileNotFoundException e) {
                System.out.println("Не смогли найти файл словаря");
            }

        }
    }

    public List<String> getEngWord() {
        return engWord;
    }

    public List<String> getTranscription() {
        return transcription;
    }

    public List<String> getTranslation() {
        return translation;
    }
}
