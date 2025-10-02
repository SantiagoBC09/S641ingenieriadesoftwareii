public class Reader {

    private String element;
    private Converter converter;

    public Reader(String element, Converter converter) {
        this.element = element;
        this.converter = converter;
    }

    public void parseInput() {
        switch (element) {
            case "LINE":
                converter.makeLine();
                break;

            case "PRAGRAPH":
                converter.makeParagraph();
                break;

            case "TABLE":
                converter.makeTable();
                break;

        }
    }

}
