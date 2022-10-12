package by.sonya.homework2;

//Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
//таким образом:
//1 1 1 1 1
//0 1 1 1 0
//0 0 1 0 0
//0 1 1 1 0
//1 1 1 1 1

public class BookTask12 {
    public static void main(String[] args) {

        final int arraySize = 5;

        int center = arraySize / 2; //получаем центр массива, после достижения центра будем уменьшать отступы
        int indent = 0; //переменная для хранения отступа от границ массива

        int[][] array = new int[arraySize][arraySize]; //создаем массив
        for(int i = 0; i < arraySize; i++){
            for (int j = 0; j < arraySize; j++){
                array[i][j] = 0; //Заполняю массив нулями
            }
        }
        for(int i = 0; i < arraySize; i++){
            for(int j = indent; j < arraySize - indent; j++){ //Устанавливаем границы, начинать с отступа и заканчивать размером массива минус отступ
                array[i][j] = 1; //заполняем единицами
            }
            if(i < center){ //если не дошли до центра
                indent++; //то увеличиваем отступ
            }
            else{
                indent--; //иначе уменьшаем
            }
        }
        for (int i = 0; i < arraySize; i++)
        {
            for (int j = 0; j < arraySize; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        }
    }
