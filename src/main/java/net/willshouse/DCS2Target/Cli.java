package net.willshouse.DCS2Target;

import org.apache.commons.cli.*;

/**
 * Created by whartsell on 12/28/2014.
 */
public class Cli {
    private String[] args = null;
    private Options options = new Options();


    public Cli (String[] args) {
        this.args = args;


        options.addOption("h","help",false,"show help");
        options.addOption("c","control-html",true,"path of the exported html control file");
        options.getOption("c").setRequired(true);
        options.addOption("o","output-ttm",true,"path to the ttm file that will be created");
        
    }
    
    public void parse() {
        CommandLineParser parser = new BasicParser();
        CommandLine cmd = null;
        try {
            cmd = parser.parse(options,args);
            if (cmd.hasOption("h"))
                help();


        } catch (ParseException e) {
            //e.printStackTrace();
            help();

        }
    }

    private void help() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.printHelp("Main",options);
        System.exit(0);
    }
}
