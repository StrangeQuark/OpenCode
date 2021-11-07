package com.t7s.opencode.java;

import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class JavaService {

    public String compileJava(String code) {
        //Create a file from the text given
        File file = createFileFromString(code);

        //Compile the file and return the logs
        String logs = compileJavaFileAndReturnLogs(file);

        //Run tests


        //Delete the file
        file.delete();

        //Return cmd logs after attempting to compile
        return logs;
    }

    private File createFileFromString(String code) {
        File file = new File("TestClass.java");
        try {
            FileWriter fw = new FileWriter("TestClass.java");
            fw.write(code);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return file;
    }

    private String compileJavaFileAndReturnLogs(File file) {
        String pathToFile = file.getAbsolutePath();
        String logs = "";

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("java", pathToFile);
            processBuilder.redirectErrorStream(true);

            Process process = processBuilder.start();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

            String s;

            while((s = stdInput.readLine()) != null) {
                logs = logs + s + "\n";
            }

            while((s = stdError.readLine()) != null) {
                logs = logs + s + "\n";
            }

            process.destroy();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return logs;
    }
}
