# Java_Lab2_3

* Создайте интерфейс Pet, который будет содержать методы:
`getName()`, который возвращает имя животного.

`getSpecies()`, который возвращает вид животного.

`feed()`, который выводит сообщение о том, что животное покормлено.

Создайте классы для нескольких животных, таких как собака, кошка и попугай, которые будут реализовывать интерфейс `Pet`.

* Вам нужно создать интерфейс `PrintableContent`, содержащий метод `void printContent()`. Затем определите два класса: `Article` и `Photo`, которые реализуют интерфейс `PrintableContent`.
Создайте массив типа `PrintableContent`, который будет содержать статьи и фотографии. Затем в цикле пройдитесь по массиву и вызовите метод `printContent()` для каждого объекта.

Создайте статический метод `printPhotos(PrintableContent[] printableContents)` в классе `Photo`, который будет выводить на консоль только фотографии, и статический метод `printArticles(PrintableContent[] printableContents)` в классе `Article`, который будет выводить на консоль только статьи. Используйте оператор `instanceof` для проверки типа каждого объекта в массиве.
