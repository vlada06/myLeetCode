package com.vld.leetcode.week2.p1678;

/**
 * date: 15/01/2022
 * time: 10:51
 */

public class GoalParserInterpreter {

    public String interpret(String command) {
        if (!command.contains("(") && !command.contains(")")) {
            return command;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < (command.length()); ) {
            String subString = "";
            if (command.substring(i, i + 1).equals("G") || command.substring(i + 1, i + 2).equals("G")) {
                subString = "G";
                i++;
            } else {
                subString = command.substring(i, i + 2);
                i += 2;
            }
            switch (subString) {
                case "G":
                    sb.append("G");
                    break;
                case "()":
                    sb.append("o");
                    break;
                case "(a":
                    sb.append("al");
                    break;
            }
        }
        return sb.toString();
    }
}
