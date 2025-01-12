public class Photo implements PrintableContent
{
    private final String __title;

    public Photo(String title)
    {
        this.__title = title;
    }

    @Override
    public void printContent()
    {
        System.out.println("Фото \"" + this.__title + "\"");
    }

    public static void printPhotos(PrintableContent[] printableContents)
    {
        for(PrintableContent pc : printableContents)
            if(pc instanceof Photo)
                pc.printContent();
    }
}
