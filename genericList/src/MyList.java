import java.util.Arrays;


public class MyList<T> {
    int capacity;
    T[] list;
    T[] listTemp;
    int size = 0;

    public MyList(int capacity) {
        this.capacity = capacity;
        this.setList();
    }

    public MyList() {
        this.capacity = 10;
        this.setList();
    }

    public void setList() {

        this.list = (T[]) new Object[this.capacity];
    }


    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return this.size;
    }

    public void add(T data) {
        if (this.size() < this.capacity) {
            list[this.size] = data;
            this.sizeCalc();
        } else {
            this.capacity = this.capacity * 2;
            this.increaseCapacity();
            this.add(data);
        }
    }


    public void sizeCalc() {
        int count = 0;
        for (T t : this.list) {
            if (t != null) {
                count++;
            }
        }
        this.size = count;
    }

    public void increaseCapacity() {
        this.listTemp = (T[]) new Object[this.capacity];
        System.arraycopy(this.list, 0, this.listTemp, 0, this.list.length);
        this.list = this.listTemp;
    }


    public T get(int idx) {
        return this.list[idx];
    }

    public void remove(int index) {
        replaceForRemove(index);
        this.size--;
    }

    public void replaceForRemove(int index) {
        T[] listTemp2 = this.list;
        this.list[index] = null;
        for (int i = 0; i < listTemp2.length - 1; i++) {
            if (index == 0) {
                this.list[i] = listTemp2[i + 1];
            } else if (i < index) {
                this.list[i] = listTemp2[i];
            } else if (i > index) {
                this.list[i] = listTemp2[i + 1];

            }
        }
    }

    public void set(int idx, T data) {
        this.list[idx] = data;
    }

    public int firstIndexOf(T data) {

        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int lastIdx = -1;
        for (int i = 0; i < this.list.length; i++) {
            if (data == this.list[i]) {
                lastIdx = i;
            }
        }
        return lastIdx;
    }

    public boolean contains(T data) {
        for (T t : this.list) {
            if (data == t) {
                return true;
            }
        }
        return false;
    }


    public void clear() {
        Arrays.fill(this.list, null);
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }


    public Object[] toArray() {
        Object[] tempObject = new Object[this.list.length];
        System.arraycopy(this.list, 0, tempObject, 0, this.list.length);
        return tempObject;
    }

    public MyList<T> subList(int x, int y) {
        MyList<T> sub = new MyList<>(y - x + 1);
        for (int i = x; i <= y; i++) {
            sub.add(this.list[i]);
        }
        return sub;
    }

    @Override
    public String toString() {
        System.out.print("[");
        for (T x : list) {
            if (x != null) {
                System.out.print(x + ",");
            }
        }
        System.out.println("]");
        return "";
    }
}