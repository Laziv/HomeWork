package com.laziv.lesson17;

public class Collection {
    private int[] arrayNumbers;

    public Collection(int[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

     class Class1 implements Iterator{
        private int index;

        @Override
        public boolean hasNext() {
            return index != arrayNumbers.length;
        }

        @Override
        public int next() {
            int element = arrayNumbers[index++];
            if (element % 2 == 0){
                return element;
            }else {
                return 0;
            }
        }

    }

    class Class2 implements Iterator{
        private int index = arrayNumbers.length - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public int next() {
            int element = arrayNumbers[index];
            index -= 2;
            return element;
        }
    }

    public void runAnonymousClass(){
        Iterator iterator = new Iterator() {
            private int index = arrayNumbers.length - 1;

            @Override
            public boolean hasNext() {
                return index >= 0;
            }

            @Override
            public int next() {
                return arrayNumbers[index--];
            }
        };

        int count = 3;
        while (iterator.hasNext()){
            int num = iterator.next();

            if (count == 3){
                if (num % 2 != 0){
                    System.out.println(num);
                }
            }

            count--;
            if (count == 0){
                count = 3;
            }
        }
    }

    public void runLocalClass(){

        class LocalClass implements Iterator{
            private int index;

            @Override
            public boolean hasNext() {
                return index != arrayNumbers.length;
            }

            @Override
            public int next() {
                return arrayNumbers[index++];
            }
        }

        LocalClass iterator = new LocalClass();
        int count = 5;
        while (iterator.hasNext()){
            int num = iterator.next();

            if (count == 5){
                if (num % 2 == 0){
                    System.out.println(num - 100);
                }
            }

            count--;
            if (count == 0){
                count = 5;
            }
        }

    }

    public static class StaticClass implements Iterator{
        private int[] arrayNumbers;
        private int index;

        public StaticClass(int[] arrayNumbers) {
            this.arrayNumbers = arrayNumbers;
        }

        @Override
        public boolean hasNext() {
            return index < arrayNumbers.length;
        }

        @Override
        public int next() {
            int element =  arrayNumbers[index];
            index += 2;
            if (element % 2 == 0){
                return element + 1;
            }else {
                return element;
            }
        }
    }
}
