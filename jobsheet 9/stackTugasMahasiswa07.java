public class stackTugasMahasiswa07 {
    
    mahasiswa07[] stack;
    int top;
    int size;

    public stackTugasMahasiswa07(int size) {
        this.size = size;
        stack = new mahasiswa07[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(mahasiswa07 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh, tidak bisa menambahkan tugas lagi.");
        }
    }

    public mahasiswa07 pop() {
        if (!isEmpty()) {
            mahasiswa07 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public mahasiswa07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public String konversiDesimalKeBiner(int nilai) {
        stackKonversi07 stack = new stackKonversi07();

        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();

        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}