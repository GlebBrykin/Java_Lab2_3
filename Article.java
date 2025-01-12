public class Article implements PrintableContent
{
    private final String __title;

    public Article(String title)
    {
        this.__title = title;
    }

    @Override
    public void printContent()
    {
        System.out.println("Статья \"" + this.__title + "\"");
    }

    public static void printArticles(PrintableContent[] printableContents)
    {
        for(PrintableContent pc : printableContents)
            if(pc instanceof Article)
                pc.printContent();
    }
}
