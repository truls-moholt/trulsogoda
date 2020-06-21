package mainPackage;

public interface IShape {

    public double area();

    public int angles();

    public double circumference();

    public boolean canContain(IShape shape);

    public boolean isIsomorphic(IShape shape);

    public boolean isSimilar();

}
