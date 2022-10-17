package car;

public class RearMirror {
    private int size;
    private boolean isElectric;

    public RearMirror(int size, boolean isElectric) {
        this.size = size;
        this.isElectric = isElectric;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
