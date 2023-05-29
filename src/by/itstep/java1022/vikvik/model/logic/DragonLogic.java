package by.itstep.java1022.vikvik.model.logic;

public class DragonLogic {
    public static int countDragonHeads(int age) {
        if (age <= 0) {
            return 0;
        }

        int head = 3;

        if (age < 201) {
            head += age * 3;
        } else if (age < 301) {
            head += 200 * 3 + (age - 200) * 2;
        } else {
            head += 200 * 3 + 100 * 2 - 300 + age;
        }

        return head;
    }
}
