package practice.month;

public enum Month {
    JAN("January", 31), FEB("February", 28), MAR("March", 31), APR("April", 30),
    MAY("May", 31), JUN("June", 30), JUL("July", 31), AUG("August", 31),
    SEP("September", 30), OCT("October", 31), NOV("November", 30), DEC("December", 31);

    private String name;
    private int days;

    Month(String name, int days) {
        this.name = name;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }
    //  Задайте emun Month, определите месяца, их наименования и количество в них дней.
    //  Реализуйте метод, позволяющий прибавлять месяца к выбранному, получая правильный месяц.
    //  Пример: AUG + 6 month = FEB
    //  Проверьте работу метода в приложении.

    //метод для увеличения кол во месяцев

    public Month plusMonth(int quantity) {
        int index = ordinal();// текущий номер месяца
        index = index + quantity;// увеличили кол во месяца
        Month[] months = values();// все константы вносим в массив типа Month
        return months[index % months.length];// возвращаем объект типа Month, index которого равен % 12
    }

}
