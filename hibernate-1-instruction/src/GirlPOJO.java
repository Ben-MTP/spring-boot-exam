public class GirlPOJO {
    private String name;

    public GirlPOJO(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // create main:
    public static void main(String[] args) {
        for(String arg : args){
            GirlPOJO girl = new GirlPOJO(arg);
            System.out.println(girl.getName());
        }
    }
}
