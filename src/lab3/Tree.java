package lab3;

public class Tree {
    int age;
    boolean alive;
    String name;

    Tree(int age, String name){
        this.age = age;
        this.name = name;
    }
    Tree (int age, boolean alive, String name){
        this.age = age;
        this.alive = alive;
        this.name = name;
    }
    Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public String getAllTreeInfo() {
        return ("Возраст - "+this.age+"\n Живое ли дерево? - "+this.alive+"\n Название - "+this.name+"\n");
    }

    public static void main(String[] args) {
        Tree tree1 = new Tree(105, "Дуб");
        System.out.println(tree1.getAllTreeInfo());
        Tree tree2 = new Tree(80, true, "Береза");
        System.out.println(tree2.getAllTreeInfo());
        Tree tree3 = new Tree();
        System.out.println(tree3.getAllTreeInfo());
    }
}
