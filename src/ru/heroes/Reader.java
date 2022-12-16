package ru.heroes;
/*
Определить класс Reader, хранящий такую информацию о пользователе библиотеки:
ФИО,
номер читательского билета,
факультет,
дата рождения,
телефон.

Методы (экземпляра, без слова static) takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса.

Перегрузить методы takeBook(), returnBook():
takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
takeBook, который будет принимать переменное количество (Тип... parameterName) объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".

Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или "Петров В. В. вернул 3 книги".

 */

public class Reader {
    String fullName;
    Integer libraryNumber;
    Integer faculty;
    String dateBirth;
    Integer phoneNumber;

    public Reader(String fullName, Integer libraryNumber, Integer faculty, String dateBirth, Integer phoneNumber) {
        this.fullName = fullName;
        this.libraryNumber = libraryNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.phoneNumber = phoneNumber;
    }

    public Reader() {

    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", libraryNumber='" + libraryNumber + '\'' +
                ", faculty='" + faculty + '\'' +
                ", dateBirth='" + dateBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public void takeBook(String... books) {
        System.out.println(libraryNumber + "." + fullName + " взял " + books.length + " книги: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void takeBook(int books) {
        System.out.println(libraryNumber + "." + fullName + " взял " + books + " книги");
    }

    public void returnBook(String... books) {
        System.out.println(libraryNumber + "." + fullName + " вернул " + books.length + " книги: ");
        for (String book : books) {
            System.out.println(book);
        }
    }

    public void returnBook(int books) {
        System.out.println(libraryNumber + "." + fullName + " вернул " + books + " книги");
    }


    public static void main(String[] args) {
        Reader reader1 = new Reader();
        Reader reader2 = new Reader("BBBBB", 2, 1, "21/1/12", 123455);
        Reader reader3 = new Reader();
        Reader reader4 = new Reader("CCCC",  3, 4, "12/03/99", 8888888);

        System.out.println(reader1);
        System.out.println(reader2);
        System.out.println(reader3);
        System.out.println(reader4);

        String[] books = {"Приключения", "Словарь", "Энциклопедия"};
        reader1.takeBook(3);
        reader2.takeBook(books);
        reader3.returnBook(3);
        reader4.returnBook(books);
    }
}
