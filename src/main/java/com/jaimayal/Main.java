package com.jaimayal;

import com.jaimayal.strategy.algorithms.search.BinarySearch;
import com.jaimayal.strategy.algorithms.search.HashSearch;
import com.jaimayal.strategy.algorithms.search.JumpSearch;
import com.jaimayal.strategy.algorithms.search.LinearSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SearchExecutor searchSelector = new SearchExecutor();
        SortExecutor sortSelector = new SortExecutor();
        
        List<String> phoneDirectoryData = importDirectory("./resources/directory.txt");
        List<String> peopleToFind = importDirectory("./resources/find.txt");

        searchSelector.setMethod(new LinearSearch());
        searchSelector.search(phoneDirectoryData, peopleToFind);
        searchSelector.printAlgorithmExecutionResults();
    }

    private static ArrayList<String> importDirectory(String pathToFile) {
        Scanner scannerFile = null;

        try {
            File fileForScanner = new File(pathToFile);
            scannerFile = new Scanner(fileForScanner);
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error. File does not exist");
            System.exit(0);
        }

        ArrayList<String> directoryData = new ArrayList<>();
        while (scannerFile.hasNext()) {
            directoryData.add(scannerFile.nextLine()
                    .replaceAll("\\d", "")
                    .trim());
        }

        return directoryData;
    }
}
