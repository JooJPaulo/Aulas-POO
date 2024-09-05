public class DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        date.setDia(1);
        date.setMes(1);
        date.setAno(2021);
        date.displayDate(date.getDia(), date.getMes(), date.getAno());
    }
}