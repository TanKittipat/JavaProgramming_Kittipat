public class Student {
    public String name;
    public int age;
    public String group;

    public static void main(String[] args) {
        Student Tu = new Student();
        // // Tu.name = "Prayut";
        // // Tu.age = 18;
        // // Tu.group = "ToylangLongKrong";
        Tu.setData("Prayut", 18, "ToylangLongKrong");

        Student Pom = new Student();
        // Pom.name = "Prawit";
        // Pom.age = 17;
        // Pom.group = "MaiRuMaiShi";
        Pom.setData("Prawit", 19, "MaiRuMaiShi");

        // System.out.println("Student name" + " " + Tu.name);
        // System.out.println("Student age" + " " + Tu.age);
        // System.out.println("Student group" + " " + Tu.group);

        // System.out.println("Student name" + " " + Pom.name);
        // System.out.println("Student age" + " " + Pom.age);
        // System.out.println("Student group" + " " + Pom.group);
        Tu.getData();
        Pom.getData();

    }

    public void setData(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public void getData() {
        System.out.println(
                this.name + " is " + this.age + " years old and is in group " + this.group);
    }

}
