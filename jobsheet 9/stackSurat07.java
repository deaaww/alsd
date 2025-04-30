public class stackSurat07 {
    surat07[] stack;
    int top;
    int size;

    public stackSurat07(int size) {
        this.size = size;
        this.stack = new surat07[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(surat07 s) {
        if (!isFull()) {
            stack[++top] = s;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan surat.");
        }
    }

    public surat07 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong, tidak ada surat yang bisa diproses.");
            return null;
        }
    }

    public surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}