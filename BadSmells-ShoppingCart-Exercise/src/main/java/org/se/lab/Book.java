package org.se.lab;

public class Book extends Article{

    private String author;


    public Book(String author, int id, String string, double price) {
        super(id, string, price);
        this.author = author;


    }

    public String getAuthor() {
        return author;
    }


    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("BOOK:\t");
            builder.append(getId());
            builder.append("\t").append(getDescription());
            builder.append("\t").append(getAuthor());
            builder.append("\t").append(getPrice());
            builder.append("\n");

            return builder.toString();
        }

    @Override
    public String toXML() {
        StringBuilder builder = new StringBuilder();
        builder.append("\t<book ");
        builder.append("id=\"" + getId() + "\"");
        builder.append(" ").append("description=\"" + getDescription() + "\"");
        builder.append(" ").append("price=\"" + getPrice() + "\"");
        builder.append(" ").append("author=\"" + getAuthor() + "\"/>");
        builder.append("\n");

        return builder.toString();

    }
}