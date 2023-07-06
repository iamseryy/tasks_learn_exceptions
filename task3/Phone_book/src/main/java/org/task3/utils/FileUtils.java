package org.task3.utils;

import org.task3.config.AppConfig;
import org.task3.exception.DataBaseException;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;

public class FileUtils {
    public static ArrayList<String> readFiles(String path) {
        var data = new ArrayList<String>();
        var files = folderFiles(path);

        if(files == null){
            return data;
        }
        for(File file: files){
            try (BufferedReader reader = new BufferedReader(new FileReader(file));){
                String line;
                while ((line = reader.readLine()) != null) {
                    data.add(line);
                }
            } catch (IOException e){
                AppConfig.LOGGER.log(Level.SEVERE, e.toString(), e);
            }
        }

        return data;
    }

    public static void writeFile(String data, File file, boolean append) throws DataBaseException {
        try (FileWriter writer = new FileWriter(file, append);){
            writer.write(data);
            writer.flush();
        } catch (IOException e) {
            AppConfig.LOGGER.log(Level.SEVERE, e.toString(), e);
            throw new DataBaseException("Database error, contact support");
        }
    }

    private static File[] folderFiles(String folderPath){
        return new File(folderPath).listFiles();
    }
}
