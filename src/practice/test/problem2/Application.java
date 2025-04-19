package practice.test.problem2;

import practice.test.problem.Monster;

public class Application {
    public static void main(String[] args) {
        // 드라큘라, 프랑켄슈타인(, 미이라(400)
        Monster mon1 = new Monster("드라큘라",200);
        Monster mon2 = new Monster("프랑켄슈타인",300);
        Monster mon3  = new Monster("미이라", 400);
        System.out.println("mon1.getKinds()=" + mon1.getKinds());
        System.out.println("mon1.getHp()=" + mon1.getHp());
        System.out.println("mon2.getKinds()=" + mon2.getKinds());
        System.out.println("mon2.getHp()=" + mon2.getHp());
        System.out.println("mon3.getKinds()=" + mon3.getKinds());
        System.out.println("mon3.getHp()=" + mon3.getHp());
    }
}
