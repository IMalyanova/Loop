public class Loop {
    public static void main(String[] args) {
        /** Отличие от while:
         * do while проверяет условие ПОСЛЕ выполнения одного цикла;
         * do while всегда выполняется хотя бы один раз.
         */
        Integer i = 200000;
        do {
            System.out.println("Билет № "+i);
            i++;
        }while (i <= 210000);
    }
}
