package prototype;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy(String nameLibrary) throws CloneNotSupportedException {
        Library cloneLibrary = (Library) super.clone();
        cloneLibrary.setName(nameLibrary);
        Set<Book> bookToClone = books.stream()
                .map(book ->  new Book(book.getTitle(),book.getAuthor(), book.getPublicationDate()))
                .collect(Collectors.toSet());
        cloneLibrary.setBooks(bookToClone);
        return cloneLibrary;
    }
}