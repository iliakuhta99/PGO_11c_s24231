package PGO_02;

import java.time.LocalDate;
import java.util.Random;

public class Book {
    private long ID;
    private String name;
    private Genre genre;
    private Lang lang;
    private LocalDate publishDate;
    private int borrowCount = 0;
    private boolean isAvaliable = true;
    private Author author;
    private Person borrowBook;

    public void book(String name, Genre genre, Lang lang, LocalDate publishDate, Author author) {
        ID = setId();
        this.name = name;
        this.genre = genre;
        this.lang = lang;
        this.publishDate = publishDate;
        this.author = author; }
    public void book(String name, Genre genre, Lang lang, Author author) {
        ID = setId();
        this.name = name;
        this.genre = genre;
        this.lang = lang;
        this.author = author; }

    public long setId() {
        return new Random().nextLong(); }
    public long getId() {
        return ID; }

    public void setName(String name) {
        if (name.isEmpty()||name==null) {
            throw new RuntimeException("To pole nie może być puste"); }
        this.name = name; }
    public String getName() {
        return name; }

    public Genre getGenre() {
        return genre; }
    public void setGenre(Genre genre) {
        if (genre == null) {
            throw new RuntimeException("To pole nie może być puste"); }
        this.genre = genre; }

    public Lang getLang() {
        return lang; }
    public void setLang(Lang lang) {
        if (lang == null) {
            throw new RuntimeException("To pole nie może być puste"); }
        this.lang = lang; }

    public LocalDate getPublishDate() {
        return publishDate; }
    public void setPublishDate(LocalDate publishDate) {
        if (publishDate.isBefore(LocalDate.now())) {
            throw new RuntimeException("Data wydania nie może być starsza niż dzisiaj"); }
        this.publishDate = publishDate; }

    public int getBorrowCount() {
        return borrowCount; }
    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount++; }

    public boolean getIsAvaliable(boolean isAvaliable){
        return isAvaliable; }
    public void setAuthor(Author author) {
        if(author == null) {
            throw new RuntimeException("To pole powinno być wypełnione"); }

        this.author = author; }
    public Author getAuthor() {
        return author; }
    public void BorrowBook(Person person){
        if(isAvaliable == false || name.isEmpty()){
            throw new RuntimeException("Nie można wyporzycic tej książki w tej chwili"); }
        borrowBook = person;
        setBorrowCount(borrowCount);
        isAvaliable = false; }

    public void GiveBack(){
        this.borrowBook = null;
        isAvaliable = true; }
}

