package lesson_2;

public class Main {
    public static void main(String[] args) throws MyArraySizeException {

        String[][] arr = new String[][]{{"1", "2", "3", "4"}, {"8", "8", "8", "8"}, {"1", "2", "2", "2"}, {"2", "2", "2", "2"}};
        try {
            int result = method(arr);
            System.out.println(result);
        } catch (MyArraySizeException e) {
            System.out.println("Размер массива превышен!");
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int method() throws MyArraySizeException, MyArrayDataException {
        return method();
    }

    public static int method(String[][] arr ) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        for (int j = 0; j < arr.length; j++) {
            try {
                count = count + Integer.parseInt(arr[i][j]);
            }
            catch (NumberFormatException e) {
                throw new MyArrayDataException(i, j);
                }
            }
        }
        return count;
        }
    }
