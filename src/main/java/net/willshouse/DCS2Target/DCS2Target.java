package net.willshouse.DCS2Target;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by whartsell on 12/27/2014.
 */
public class DCS2Target {
    public static void main(String[] args) {
        FileWriter out;
        PrintWriter printWriter = null;
        if (!(args.length >0)) {
            System.err.println("you must pass the full path to the keyboard.html file you want to process");
            System.exit(1);
        }
        File keyboard = new File(args[0]);
        String outputPath = keyboard.getAbsolutePath();

        File output = new File(outputPath.substring(0,outputPath.lastIndexOf(File.separator))+ File.separator + "keyboard.ttm");
        Document doc = null;
        List<TargetKeyMacro> macros = new ArrayList<TargetKeyMacro>();
        try {
            doc = Jsoup.parse(keyboard, "UTF-8");
            for (Element table : doc.select("table")) {
                for (Element row : table.select("tr")) {
                    Elements tds = row.select("td");
                    if (tds.size() >2) {
                        TargetKeyMacro macro = new TargetKeyMacro();
                        macro.setCategory(tds.get(2).text());
                        macro.setName(tds.get(1).text());
                        macro.setCommand(tds.get(0).text());
                        macros.add(macro);
                        //System.out.printf("Created Macro: Category:%s\tName:%s\tCommand:%s\n", macro.getCategory(), macro.getName(), macro.getCommand());
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        try {

            HashMap<String,HashMap<String,String>> commands = new HashMap<String, HashMap<String, String>>();
            for (TargetKeyMacro macro : macros) {
                if (! commands.containsKey(macro.getCategory())) {
                    HashMap<String,String> category = new HashMap<String, String>();
                    commands.put(macro.getCategory(),category);
                }
                if (commands.containsKey(macro.getCategory())) {
                    HashMap<String,String> category = commands.get(macro.getCategory());
                    category.put(macro.getName(),macro.getCommand());
                }
            }
            out = new FileWriter(output);
            printWriter = new PrintWriter(out);
            printWriter.print("//Created by DCS2Target\n\n\n");
            printWriter.print("include \"usbkeys.ttm\"\n\n\n");

            for(Map.Entry<String,HashMap<String,String>> entry:commands.entrySet()) {
                printWriter.printf("\n//%s\n\n",entry.getKey());
                HashMap<String,String> categoryCommands = entry.getValue();
                for (Map.Entry<String,String> command:categoryCommands.entrySet()) {
                    printWriter.printf("define %-50s\t%-40s\n", command.getKey(), command.getValue());
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (printWriter !=null) {
                printWriter.close();
            }
        }
    }

}
