public class Main {
    public static void main(String[] args) {

        String name = "staffy";
        MemberController memberController = new MemberController();
        for(int i=0;i<100;i++){
            Member member = new Member("member"+i,name+i,name+i+"@gmail.com");
            memberController.addMember(member);
        }
        System.out.println(memberController.getMembers());
        BookController bookController = new BookController();
        String bookName = "Hare and Tortoise";
        for(int i=0;i<100;i++){
            Book book = new Book("book"+i,bookName+i,"xxx"+i,"ISBN"+bookName+i,2025,i*45.98);
            bookController.addBook(book);
        }

        LibraryService libraryService = new LibraryService(bookController,memberController);
        libraryService.getAvailabilityOfBook("book30");

        libraryService.borrowBook("member2","book30");
    }
}