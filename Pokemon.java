public abstract class Pokemon {

    private String name;
    private String food;


    public Pokemon(String name, String food) {
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void typeWeakness();

    public void eating(){
        System.out.println(getName() + " eats a berry to heal!");
    }

    public void speaks(){
        System.out.println(getName() + " says pokemon noises!");
    }



}
