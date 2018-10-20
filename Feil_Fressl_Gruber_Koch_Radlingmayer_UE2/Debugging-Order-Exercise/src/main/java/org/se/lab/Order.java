package org.se.lab;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

class Order
        extends Entity {

    public Order(int id, Date date) {
        setId(id);
        setDate(date);
    }


    public Date date;

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    // Association: ---[*]-> OrderLine

    private final List<OrderLine> lines = new ArrayList<>();

    public void addLine(OrderLine line) {
        if (line == null)
            throw new IllegalArgumentException();
        lines.add(line);
    }

    public List<OrderLine> getLines() {
        return lines;
    }


    // Object methods

    @Override
    public String toString() {
        SimpleDateFormat f = new SimpleDateFormat("dd.MM.yyyy");

        return getId() + "," + f.format(getDate()) + getLines();
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj) && obj instanceof Order) {
            Order ord = (Order) obj;
            return (this.date == ord.date);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.date);
    }
}
