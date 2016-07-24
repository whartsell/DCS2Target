package net.willshouse.DCS2Target;

import java.util.List;

/**
 * Created by whartsell on 12/27/2014.
 */
public class TargetKeyMacro {
    private String category;
    private String name;
    private String command;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        category = category.replace(String.valueOf((char)160)," ");
        category.trim();
        if (category.equals(" ")) {
            category = "Not Categorized";
        }
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = makeNameSafe(name);
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = formatCommand(command);
    }

    private String makeNameSafe(String aName) {

        String safe;
        safe = aName.replace(" ","_");
        safe = safe.replace(String.valueOf((char)160)," ");
        safe = safe.replaceAll("[^a-zA-Z0-9_]","");
        if (Character.isDigit(safe.charAt(0))) {
            safe = "_" + safe;
        }
        //System.out.println("original: " + aName + " Safe: " + safe);
        return safe;
    }

    private String formatCommand(String aCommand) {
        String safe = aCommand;
        safe = aCommand.replace("\"","");
        safe = safe.replace(String.valueOf((char)160)," ");
        safe = safe.trim();
        String[] keys = safe.split(" - ");
        StringBuilder safeKeys = new StringBuilder();
        for (int i = 0; i < keys.length; i++) {
            String key = keys[i];
            for (List<String> commandFilter : CommandMappings.commandFilters) {
                if (key.equals(commandFilter.get(0))) {
                    key = commandFilter.get(1);
                }
            }
            safeKeys.append(key);
            if (i <(keys.length-1)) {
                safeKeys.append(" + ");
            }
        }

        return safeKeys.toString();
    }
}
