package lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    private static int size;

    private static int winSize;
    private static final char DOT_EMPTY = '.';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';

    private static char[][] MAP = new char[size][size];


    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();

    private static int turnsCount = 0;
    public static final String HEADER_FIRST_SYMBOL = "♦";
    public static final String SPACE_MAP_SYMBOL = " ";

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        do {
            System.out.println("\n\nИГРА НАЧИНАЕТСЯ!");
            init();
            printMap();
            playGame();
        } while (continuemGame());
    }

    private static boolean continuemGame() {
        System.out.println("Продолжить y\\n");
        return switch (in.next()) {
            case "y", "н" -> true;
            default -> false;
        };
    }

    private static void init() {
        turnsCount = 0;
        size = getSizeFromUser();
        winSize = getWinSize();
        initMap();
    }

    private static int getWinSize() {
        if (size >= 3 && size <= 6) {
            return 3;
        } else if (size > 6 && size >= 10) {
            return 4;
        }

        return 5;
    }

    private static int getSizeFromUser() {
        System.out.println("Необходимо выбрать размер игрового поля");
        return gerValidNumberFromScanner(3, 9);
    }

    private static void initMap() {

        MAP = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeader();
        printBody();
    }

    private static void printHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP_SYMBOL);
    }

    private static void printBody() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();

        }
    }

    private static void playGame() {
        while (true) {
            //Ход человека
            humanTurn();
            printMap();//Печать игрового поля
            if (checkEnd(DOT_HUMAN)) {
                break;
            }
            //Ход компютера
            aiTurn();
            printMap();//Печать игрового поля
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }

    private static void humanTurn() {
        System.out.println("\nХод человека");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите номер строки: ");
            rowNumber = gerValidNumberMapLineFromScanner();
            System.out.print("Введите номер столбца: ");
            columnNumber = gerValidNumberMapLineFromScanner();

            if (isCallFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.printf("ОШИБКА! Ячейка с координатами %s:%s уже используется!\n", rowNumber + 1, columnNumber + 1);
        }
        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int gerValidNumberMapLineFromScanner() {
        return gerValidNumberFromScanner(1, size) - 1;
    }

    private static int gerValidNumberFromScanner(int min, int max) {
        while (true) {
            System.out.println("Введите число: ");
            if (in.hasNextInt()) {
                int n = in.nextInt();
                if (isNumberValid(n, min, max)) {
                    return n;
                }
                System.out.printf("Ошибка! Проверте значение координат. Должно быть от %s до %s. Введено: %s%n", min, max, n);

            } else {
                System.out.printf("Ошибка! Ввод допускает только целые числа. %s - не число целое число.%n", in.next());
            }
        }
    }

    private static boolean isNumberValid(int n, int min, int max) {
        return n >= min && n <= max;
    }

    private static boolean isCallFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void aiTurn() {
        System.out.println("\nХод ход компютера");
        int rowNumber;
        int columnNumber;

        do {

            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
        } while (!isCallFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {
//коней игры
        //проверка на победу
        if (checkWin(symbol)) {
            if (symbol == DOT_HUMAN) {

                System.out.println("Ура вы победили");
            } else {
                System.out.println("Победил компютер");
            }
            return true;
        }
        //проверка на нечью
        if (checkDraw()) {
            System.out.println("НИЧЬЯ!");
            return true;
        }

        return false;
    }

    private static boolean checkDiag(char symbol) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i = 0; i < winSize; i++) {
            toright = toright & (MAP[i][i] == symbol);
            toleft = toleft & (MAP[winSize - i - 1][i] == symbol);
        }
        if (toright || toleft) return true;

        return false;
    }

    private static boolean checkLan(char symbol) {
        boolean cols, rows;
        for (int i = 0; i < winSize; i++) {
            cols = true;
            rows = true;
            for (int j = 0; j < winSize; j++) {
                cols &= (MAP[i][j] == symbol);
                rows &= (MAP[j][i] == symbol);
            }

            if (cols || rows) return true;
        }
        return false;
    }

    private static boolean checkWin(char symbol) {
        if (checkDiag(symbol) || checkLan(symbol)) {
            return true;
        }
        return false;
    }

    /*        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) return
                    true;
            if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) return
                    true;
            if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) return
                    true;
            if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) return
                    true;
            if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) return
                    true;
            if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) return
                    true;
            if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) return
                    true;
            if (MAP[2][0] == symbol && MAP[1][1] == symbol && MAP[0][2] == symbol) return
                    true;
            return false;
        }*/
    private static boolean checkDraw() {
        return turnsCount >= size * size;
    }
}

