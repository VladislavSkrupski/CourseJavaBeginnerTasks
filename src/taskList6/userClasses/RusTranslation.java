package taskList6.userClasses;

import java.util.List;

public class RusTranslation {
    private String engWord;
    private String translation;
    private List<String> synonyms;

    public RusTranslation(String engWord, String translation) {
        this.engWord = engWord;
        this.translation = translation;
    }

    public RusTranslation(String engWord, String translation, List<String> synonyms) {
        this.engWord = engWord;
        this.translation = translation;
        this.synonyms = synonyms;
    }

    public String getEngWord() {
        return engWord;
    }

    @Override
    public String toString() {
        return "Перевод на русский: " + translation + "\nСинонимы: " + synonyms.toString();
    }
}
