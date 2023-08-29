package lesson26;

public class OurStringBuilder {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(str.substring(2));
        System.out.println(str);
        str = "frtu";

        //StringBuilder используется для создания изменяемых строк
        //конструкторы:
        /*
        StringBuilder() пустой стрингбилдер
        StringBuilder(String)  стрингбилдер со строкой String
        StringBuilder(int length) пустой стрингбилдер размера length

        method append(String s) добавляет строку к имеющейся

         */

        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" ").append("Java");
        System.out.println(sb);


        //StringBuilder

    /*
    конструкторы:
    StringBuilder()
    StringBuilder(String str)
    StringBuilder(int capacity)


    методы:
    append(String s) - используется для добавления строки к уже имеющейся.Метод также может добавлять целые числа
    float ,double
     */

// insert выставляет строку в исхоную начиная с указанной позиции

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" ").append("Java");
        System.out.println(sb1);

        StringBuilder sbInsert = new StringBuilder("Hello");
        sbInsert.insert(1, "World");
        System.out.println(sbInsert);
        // replace заменяет исходную строку с указаной позиции заканчивая c указанной позицией

        StringBuilder sbReplace = new StringBuilder("Hello");
        sbReplace.replace(1,3,"Java");
        System.out.println(sbReplace);

        // delete () удаляет строку между указанными индексами

        StringBuilder sbDelete=new StringBuilder("Hello");
        sbDelete.delete(1,3);
        System.out.println(sbDelete);

        //reverse () разворачивает строку

        StringBuilder sbReverse =new StringBuilder("Hello");
        sbReverse.reverse();
        System.out.println(sbReverse);

    }
}
