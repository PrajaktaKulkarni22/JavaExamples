class Encap{

    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationDemo{
    public static void main(String[] args) {
        Encap e=new Encap();
        e.setId(10);
        e.setName("abc");
        e.setAge(30);

        System.out.println("Id: "+e.getId()+" Name: "+e.getName()+" Age: "+e.getAge());
    }
}

