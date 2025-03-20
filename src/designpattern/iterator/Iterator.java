package designpattern.iterator;

public interface Iterator<E> {
    boolean hasNext();
    E next();
    public void remove();
}
