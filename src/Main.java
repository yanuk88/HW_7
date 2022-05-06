public class Main {
    public static void main(String[] args) {
        //exercise 1
        String givenName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = lastName +" " + givenName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        //exercise 2
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName1);

        //exercise 3
        String fullName2 = fullName.replace('ё', 'е');
        System.out.println(fullName2);


    }
}