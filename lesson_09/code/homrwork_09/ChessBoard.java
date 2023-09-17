package homrwork_09;

public class ChessBoard   {
    public static void main(String[] args) {
        int size = 8; // Размер доски (8x8)

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                // Определяем цвет клетки: белая (0) или черная (1)
                int color = (row + col) % 2;

                // Выводим символы для белых и черных клеток
                if (color == 0) {
                    System.out.print("0 "); // Белая клетка
                } else {
                    System.out.print("1 "); // Черная клетка
                }
            }

            // Переход на новую строку после каждой строки доски
            System.out.println();
        }
    }
}


