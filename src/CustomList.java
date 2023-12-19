import java.util.Arrays;

public class CustomList {
    private int[] list;

    public CustomList(int[] array) {
        this.list = array;
    }

    public CustomList() {
        this.list = new int[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(this.list);
    }


    public int indexOf(int number) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(int numb) {
        for (int i = this.list.length - 1; i >= 0; i--) {
            if (this.list[i] == numb) {
                return i;
            }
        }
        return -1;
    }

    public int get(int index, int number) {
        if (index >= 0 && index < this.list.length) {
            return this.list[index];
        } else {
            return number;
        }
    }

    public int get(int index) {
        return get(index, 0);
    }

    public void add(int numb) {
        int[] newList = new int[this.list.length + 1];
        copyArray(this.list, newList);
        newList[newList.length - 1] = numb;
        this.list = newList;
    }

    public int getMax() {
        int result = this.list[0];
        for (int elem : this.list) {
            if (elem > result) {
                result = elem;
            }
        }
        return result;
    }

    public int pop() {
        int[] newArray = new int[this.list.length - 1];
        int lastElem = this.list[this.list.length - 1];
        copyArray(this.list, newArray);
        this.list = newArray;
        return lastElem;
    }

    private void copyArray(int[] init, int[] result) {
        int minLength = (init.length > result.length) ? result.length : init.length;

        for (int i = 0; i < minLength; i++) {
            result[i] = init[i];
        }
    }

    public void remove(int number) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i] == number) {
                shiftByIndex(i);
                return;
            }
        }
    }

    public void shiftByIndex(int index) {
        for (int i = index; i < this.list.length - 1; i++) {
            this.list[i] = this.list[i + 1];
        }
    }

    public void removeByIndex(int index) {
        if (index < this.list.length && index >= 0) {
            shiftByIndex(index);
            pop();
        } else {
            System.out.println("Не верный индекс!");
        }
    }

    public void removeAllByIndex(int index) {
        if (index < this.list.length && index >= 0) {
            int value = this.list[index];
            int i = 0;
            while (i < this.list.length) {
                if (this.list[i] == value) {
                    shiftByIndex(index);
                    pop();
                } else {
                    i++;
                }
            }
        } else {
            System.out.println("Не верный индекс!");
        }
    }
}


//Задание 2: Реализация метода removeAllByIndex для удаления всех элементов по индексу в пользовательском списке.
//
//Описание задания: Вам необходимо разработать метод removeAllByIndex для пользовательского списка (CustomList),
// который будет осуществлять удаление всех элементов по указанному индексу.
// Метод по указанному индексу находит значение и удаляет все вхождения данного значения.
//
//Убедитесь, что метод обрабатывает ситуации с корректными и некорректными индексами, а
// также что он корректно сортирует и обновляет элементы списка после удаления.


//Задание 1: Реализация метода removeByIndex для удаления элемента по индексу в пользовательском списке.
//
//Описание задания: Вам необходимо разработать метод removeByIndex для пользовательского списка
// (CustomList), который будет осуществлять удаление элемента по указанному индексу.
//
//Убедитесь, что метод обрабатывает ситуации с корректными и некорректными индексами,
// а также что он корректно сдвигает и обновляет элементы списка после удаления.


// доработать метод remove таким образом, чтобы в цикле определялся индекс
// удаляемого элемента и все последующие элементы массива сдвигает на один шаг в лево

// создать метод shiftByIndex, который получает через аргументы индекс в массиве
// и начиная с этого индекса сдвигает все элементы на 1 шаг в лево
/*
    1, 2, 3, 4, 5, 6, 7
    shiftByIndex(2)

    1, 2, 4, 5, 6, 7, 7
*/


//// создать метод remove, который получает число в качестве аргумента и
//// сравнивает его с каждым числом массива
//// если совпадение, то выводится в терминал "YES", в ином случае "NO" (на каждое сравнение)