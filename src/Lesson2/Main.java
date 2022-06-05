package Lesson2;

public class Main {
    static String[][] DataException = {{"7", "6", "5", "4"}, {"1", "4", "2", "5"}, {"2", "4", "1", "9"}, {"52", "6", "6", "м"}};

    static String[][] SizeException = {{"1", "7"}, {"0", "6",}, {"8", "6"}, {"5", "3"}};

    static String[][] WithNoError = {{"5", "9", "3", "4"}, {"5", "6", "2", "8"}, {"1", "6", "3", "8"}, {"6", "9", "7", "1"}};

    static int maxlength = 4;
    static int maxwidth = 4;

    public static void main(String[] args) {

        try {
            System.out.println("Сумма массива: " + getSum(WithNoError));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSum(SizeException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("Сумма массива: " + getSum(DataException));
        } catch (MyArraySizeException | MyArrayDataException ex){
            System.out.println(ex.getMessage());
        }
    }

    static void checkValue(String[][] array) throws MyArraySizeException{
        if(array.length!=maxlength || array[0].length!=maxwidth) throw new MyArraySizeException();
    }

    static Integer getSum(String[][] array) throws MyArrayDataException,MyArraySizeException{
        checkValue(array);
        Integer result = 0;
        int i=0;
        int j=0;
        try {
            for (; i < array.length; i++) {
                j = 0;
                for (; j < array.length; j++) {
                    result +=  Integer.parseInt(array[i][j]);
                }
            }
        } catch (NumberFormatException ex){
            throw new  MyArrayDataException("Ошибка позиции: " + i+","+j);
        }

        return result;
    }

    public static class MyArraySizeException extends Exception {
        public MyArraySizeException(){
            super("Ошибка размерности массива");
        }
    }

    public static class MyArrayDataException extends Exception {
        public MyArrayDataException(String message){
            super(message);
        }
    }

}
