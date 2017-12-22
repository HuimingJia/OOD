package BookerReaderSystem;
//The class OnlineReaderSystem represents the body of our program. We could implement
//        the class such that it stores information about all the books, deals with user management, and refreshes the display, but that would make this class rather hefty.Instead, we’ve chosen to tear off these components into Library, UserManager, and Display classes.
//
//        The classes :
//
//        User
//        Book
//        Library
//        UserManager
//        Display
//        OnlineReaderSystem
public class OnlineReaderSystem {
    private Library library;
    private UserManager userManager;
    private Display display;
    private Book activeBook;
    private User activeUser;

    public OnlineReaderSystem() {
        userManager = new UserManager();
        library = new Library();
        display = new Display();
    }

    public Library getLibrary() {
        return library;
    }

    public UserManager getUserManager() {
        return userManager;
    }

    public Display getDisplay() {
        return display;
    }

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book book) {
        activeBook = book;
        display.displayBook(book);
    }

    public User getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(User user) {
        activeUser = user;
        display.displayUser(user);
    }
}
