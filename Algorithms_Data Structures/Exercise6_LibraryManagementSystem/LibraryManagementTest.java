public class LibraryManagementTest {

    public static void main(String[] args) {

        // Unsorted Array
        Book[] books = {

                new Book(
                        101,
                        "Java Programming",
                        "Herbert Schildt"),

                new Book(
                        102,
                        "Data Structures",
                        "Seymour Lipschutz"),

                new Book(
                        103,
                        "Operating Systems",
                        "Galvin"),

                new Book(
                        104,
                        "Computer Networks",
                        "Forouzan"),

                new Book(
                        105,
                        "Database Systems",
                        "Korth")
        };

        // Sorted by Title
        Book[] sortedBooks = {

                new Book(
                        104,
                        "Computer Networks",
                        "Forouzan"),

                new Book(
                        105,
                        "Database Systems",
                        "Korth"),

                new Book(
                        102,
                        "Data Structures",
                        "Seymour Lipschutz"),

                new Book(
                        101,
                        "Java Programming",
                        "Herbert Schildt"),

                new Book(
                        103,
                        "Operating Systems",
                        "Galvin")
        };

        System.out.println(
                "===== LINEAR SEARCH =====");

        Book result1 =
                LibrarySearch.linearSearch(
                        books,
                        "Database Systems");

        if (result1 != null) {

            System.out.println(
                    "Book Found:"
            );

            System.out.println(result1);

        } else {

            System.out.println(
                    "Book Not Found"
            );
        }

        System.out.println();

        System.out.println(
                "===== BINARY SEARCH =====");

        Book result2 =
                LibrarySearch.binarySearch(
                        sortedBooks,
                        "Java Programming");

        if (result2 != null) {

            System.out.println(
                    "Book Found:"
            );

            System.out.println(result2);

        } else {

            System.out.println(
                    "Book Not Found"
            );
        }
    }
}