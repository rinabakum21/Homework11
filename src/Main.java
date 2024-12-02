public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);


        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        dog = dog * 3.5;
        System.out.println(dog);
        cat = cat * 1.6;
        System.out.println(cat);
        paper = paper * 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var fighterWeight1 = 78.2;
        System.out.println("Масса первого бойца " + fighterWeight1 + " кг!");
        var fighterWeight2 = 82.7;
        System.out.println("Масса второго бойца " + fighterWeight2 + " кг!");
        var totalWeight = fighterWeight1 + fighterWeight2;
        System.out.println("Общая масса бойцов " + totalWeight + " кг!");
        var weightDifference = fighterWeight2 - fighterWeight1;
        System.out.println("Разница между массами бойцов " + weightDifference + " кг!");


        var weightDifference1 = fighterWeight2 - fighterWeight1;
        System.out.println("Разница между массами бойцов 1 " + weightDifference1 + " кг!");
        var weightDifference2 = fighterWeight2 % fighterWeight1;
        System.out.println("Разница между массами бойцов 2 " + weightDifference2 + " кг!");

        var officeHours = 650;
        var employeers = officeHours / 8;
        System.out.println("Всего работников в компании - " + employeers + " человек");
        var newEmployees = employeers + 94;
        officeHours = officeHours * 8;
        System.out.println("Если в компании работает " + newEmployees + " человек, то всего " + officeHours + " часов работы может быть поделено между сотрудниками");
    }
}