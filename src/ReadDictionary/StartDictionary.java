package ReadDictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StartDictionary {
    public static void main(String[] args) throws FileNotFoundException {
//        считываем из файла в переменную dictionaryFromFile
        File dictionaryFromFile = new File("EngDictionary2");

//        сканируем из переменной типа File в переменную тмпа Scanner
        Scanner scannerDictionary = new Scanner(dictionaryFromFile);

        scannerDictionary.useDelimiter(";"); // заменяем знак отделяющий по умолчанию на знак ";"


//        создаем безразмерный массив типа List
        List<String> engWord = new ArrayList<>();
        List<String> transcription = new ArrayList<>();
        List<String> translation = new ArrayList<>();

//        пробегаемся по массиву с помощью hasNextLine (сканирует всю строку)
//        и записывая данные в массив при помощи .add считывая данные при помощи .next
        while (scannerDictionary.hasNext()) {
            engWord.add(scannerDictionary.next());
            transcription.add(scannerDictionary.next());
            translation.add(scannerDictionary.next());
        }

        Random rndLineDictionary = new Random();


        Scanner inputCommand = new Scanner(System.in);


        while (true) {
            System.out.println();
            System.out.println();
//            генерируем случайное число для линии
            int nextLineNumber = (rndLineDictionary.nextInt(0, engWord.size()));
            System.out.println("Прочитайте и переведите слово " + engWord.get(nextLineNumber));
            String command = inputCommand.next();
//          для проверки строковых переменных используем .equals
            if (command.equals("y")) {
                System.out.println("*** " + transcription.get(nextLineNumber) + " - "
                        + translation.get(nextLineNumber) + " ***");

            }else if (command.equals("n")){
                System.out.println("*** " + "Очень жаль, перевод " + transcription.get(nextLineNumber)
                        + " - " + translation.get(nextLineNumber) + " ***");
            }else if (command.equals("b")) {
                break;
            }else  System.out.println("*** " + transcription.get(nextLineNumber) + " - "
                    + translation.get(nextLineNumber) + " ***");

        }
    }
}





//            }

//                System.out.println((transcription.get(nextLineNumber) + " - " + translation.get(nextLineNumber)));
//            } else System.out.println("Тогда все");
//        }

//            if (inputCommand.hasNext()) {
//                String command = inputCommand.next();
//                switch (command) {
//                    case "y" -> System.out.println(transcription.get(nextLineNumber)
//                            + " - " + translation.get(nextLineNumber));
//                    case "n" -> System.out.println("Очень плохо!!!");
//
//                };


//            }


