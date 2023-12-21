package archive.model;


public enum Menu {
    ADD(1, "Add document"), DEL(2, "Remove document"), FIND(3, "Find document"), DATES(4, "View documents between dates"), FOLDER(5, "View documents from folder"), ALL(6, "View all documents"), QUA(7, "Total quantity of documents"), EXIT(8, "Exit");

    private final int num;
    private final String action;

    Menu(int num, String action) {
        this.num = num;
        this.action = action;
    }

    public int getNum() {
        return num;
    }

    public String getAction() {
        return action;
    }
    public static void printMenu(){
        Menu[] menus = Menu.values();
        for (int i = 0; i < menus.length; i++) {
            System.out.print(menus[i].num + " - " + menus[i].action + " | ");
        }
        System.out.println();
    }
}

