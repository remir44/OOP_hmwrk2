import java.io.Serializable;

public class Main implements Serializable {
        public static void main(String[] args) {
                Person p1 = new PersonWoman("Christine", 32);
                Person p2 = new PersonMan("Phil", 34);
                Person p3 = new PersonMan("Will", 10);
                Person p4 = new PersonWoman("Niki", 7);
                Person p5 = new PersonMan("Eret", 65);
                Person p6 = new PersonWoman("Cara", 67);
                GeoTree gt = new GeoTree();
                gt.append(p1, p3);
                gt.append(p1, p4);
                gt.append(p2, p3);
                gt.append(p2, p4);
                gt.append(p5, p2);
                gt.append(p6, p2);
                gt.appendG(p5, p3);
                gt.appendG(p5, p4);
                gt.appendG(p6, p3);
                gt.appendG(p6, p4);
                gt.addendBS(p3, p4);

                System.out.printf("Дети %s: ", p1.fullName);
                System.out.println(new Reserch(gt).spend(p1, Relationship.parent));

                System.out.printf("%s - %s", p1.fullName, ((Person) p1).getGender());
                System.out.println();

                System.out.printf("Вывод дедушек и бабушек %s: ", p3.fullName);
                System.out.println(new Reserch(gt).spend(p3, Relationship.grandchildren));

                System.out.println("Вывод всех людей с отношениями grandparents: ");
                System.out.println(new Reserch(gt).spend1(Relationship.grandparents));

                System.out.println("Вывод всех людей старше 10: ");
                System.out.println(new Reserch(gt).spend2(10));

                System.out.printf("Вывод людей старше %s: \n", p1.fullName);
                System.out.println(new Reserch(gt).spend3(p1));

                System.out.println();
                WriteFile fw = new WriteFile();
                fw.save(new Reserch(gt).spend2(10));
        }
}