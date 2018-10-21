package textanalyzer;

/**
 * @author Niloufar Mazloumpour
 * @mail niloufar@mazloumpour.net
 * @since 2018-05-22
 */
class WordInfo {
    private String word;
    private Integer repeatedTimes;

    WordInfo(String word, Integer repeatedTimes) {
        this.word = word;
        this.repeatedTimes = repeatedTimes;
    }

    public String getWord() {
        return word;
    }

    public int getRepeatedTimes() {
        return repeatedTimes;
    }
}
