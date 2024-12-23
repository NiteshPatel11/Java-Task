abstract class shap {
    public abstract void draw();
}
 class circle extends shap{
    @Override
    public void draw() {
     System.out.println("circle");
    }
}
class rectangle extends shap{

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
class print{
    public static void main(String[] args){

        circle c = new circle();
        rectangle r = new rectangle();
        c.draw();
        r.draw();
    }
}