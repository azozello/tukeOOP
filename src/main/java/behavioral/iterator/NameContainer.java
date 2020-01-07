package behavioral.iterator;

public class NameContainer implements Container {

    public char[] charSequence;

    public NameContainer(String name) {
        this.charSequence = name.toCharArray();
    }

    public Iterator getIterator() {
        return new NameContainerIterator();
    }

    private class NameContainerIterator implements Iterator {
        int i;

        public boolean hasNext() {
            if (i < charSequence.length) {
                return true;
            }
            return false;
        }

        public Object next() {
            if (this.hasNext()) {
                return charSequence[i++];
            }
            return null;
        }
    }
}
