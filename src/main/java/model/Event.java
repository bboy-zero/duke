package model;

public class Event extends Task {
    protected String by;

    public Event(String description, String by) {
        super(description);
        this.by = by;
    }

    @Override
    public boolean isDone() {
        return super.isDone();
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (by: " + by + ")";
    }
}
