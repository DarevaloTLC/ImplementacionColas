public interface QueueInterface<E> {
    public void push (E e);
    public E pull ();
}
