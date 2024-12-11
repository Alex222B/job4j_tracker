package ru.job4j.inheritance;

public class ReportUsage {

    public static void main(String[] args) {
        TextReport treport = new TextReport();
        String text = treport.generate("Report's name", "Report's body");
        System.out.println(text);
        HtmlReport hreport = new HtmlReport();
        text = hreport.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
