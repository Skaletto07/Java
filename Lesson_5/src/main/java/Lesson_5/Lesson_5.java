package Lesson_5;

public class Lesson_5 {

    public static void main(String[] args) {

        Employee[] emArr = new Employee[5];
        emArr[0] = new Employee("Ivanov Ivan Ivanovich", "Director ", "ivanov@ya.ru", "+79991112233", 666666, 60);
        emArr[1] = new Employee("Sidorov Isidor Ivanovich", "Senior Manager", "Sidorov@ya.ru", "+79151112244", 255666, 47);
        emArr[2] = new Employee("Petrov Petr Petrovich", "Supervision", "Petrov@ya.ru", "+79791113311", 230000, 39);
        emArr[3] = new Employee("Zub Ivan Victorovich", "Manager", "Zub@ya.ru", "+79882224872", 190000, 30);
        emArr[4] = new Employee("Pupkin Jim Jimovich", "Clerk", "Jim@ya.ru", "+79656661313", 190000, 24);


        for (int i = 0; i < emArr.length; i++) {
            emArr[i].info();
        }
        System.out.println();
        for (int i = 0; i < emArr.length; i++) {
          if (emArr[i].age > 40) emArr[i].info();
        }

    }
}
