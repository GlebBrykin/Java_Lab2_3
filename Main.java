public class Main
{
    public static void main(String[] args)
    {
        System.out.println("********************");
        System.out.println("Задача 1");
        System.out.println("********************");
        Dog dog = new Dog("Мухтар");
        Cat cat = new Cat("Муся");
        Parrot parrot = new Parrot("Кеша");
        System.out.printf("%s %s\n", dog.getSpecies(), dog.getName());
        dog.feed();
        System.out.printf("%s %s\n", cat.getSpecies(), cat.getName());
        cat.feed();
        System.out.printf("%s %s\n", parrot.getSpecies(), parrot.getName());
        parrot.feed();

        System.out.println("********************");
        System.out.println("Задача 2");
        System.out.println("********************");
        PrintableContent[] printableContents = new PrintableContent[]
        {
                new Article("Учим Java за неделю"),
                new Photo("Главная форма IDE"),
                new Article("Интерфейсы в языке Java"),
                new Article("Лямбда-функции в языке Java"),
                new Photo("Логотип Java")
        };
        for(PrintableContent pc : printableContents)
            pc.printContent();
        System.out.println("Все статьи:");
        Article.printArticles(printableContents);
        System.out.println("Все фотографии:");
        Photo.printPhotos(printableContents);
    }
}